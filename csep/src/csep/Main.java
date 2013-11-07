package csep;

import java.io.FileInputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Injector;

public class Main {
	
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("x.coffee");
		int c = 0;
		int n = 0;
		while((n=in.read())>0) c++;
		in.close();
		System.out.println(c);
		
		
		Injector i = new CoffeeScriptStandaloneSetup().createInjectorAndDoEMFRegistration();
		ResourceSet rs = i.getInstance(ResourceSet.class);
		XtextResource r = (XtextResource)rs.getResource(URI.createURI("x.coffee"), true);
		r.load(null);
		System.out.println(r.getParseResult().getRootNode().getTotalLength());
	}

}
