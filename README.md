# CoffeeScript Eclipse Plugin

[![Build Status](https://secure.travis-ci.org/Nodeclipse/coffeescript-eclipse.png)](http://travis-ci.org/Nodeclipse/coffeescript-eclipse)
<a href="http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=1097343" title="Drag and drop into a running Eclipse to install Nodeclipse CoffeeScript Editor">
  <img src="http://marketplace.eclipse.org/sites/all/modules/custom/marketplace/images/installbutton.png"/>
</a>

This is a project to provide an Eclipse plugin for [CoffeeScript][coffeescript], using [Xtext][xtext].
Development uses Xtext 2.1 (TODO update to the latest 2.4.3).
It works as a regular Eclipse plugin (see Installation for details).
Highlights include

 - syntax highlighting
 - variable autocompletion in the current namespace
 - autoindent

> It's aimed at being mostly compatible with the original CoffeeScript project.
>There are some extra features and some missing,
 but you probably (and hopefully) won't notice the difference in everyday use.

## Status

<b>Looking for owner<b> and DIY mode

coffeescript-eclipse has not been updated for a year.
Paul has contacted Adam Schmideg, the original author at FORMULA 400, and got blessing for Nodeclipse
to be new home for CoffeScript Editor. Current Nodeclipse team lacks needed skills (and time) to continue the project,
but tell the world that if there will be a person willing to make maintenance release
and do some refresh (and possibly become project owner),
we will include CoffeeScript Editor into Nodeclipse distributions.

In August 2013 0.3.0 refresh version was released, with no new features, except for icon and migration to maven/tycho build.

Old issues <https://github.com/adamschmideg/coffeescript-eclipse/issues?state=open>, and <https://bitbucket.org/adamschmideg/coffeescript-eclipse/issues?status=new&status=open>

**If you found a bug, send Pull Request.**

If you reference any issues in this repository add "Nodeclipse#", otherwise GitHub searches
 in <https://github.com/adamschmideg/coffeescript-eclipse> repository.
 
Post in Eclipse XText forum [XText based CoffeeScript Editor project is looking for new owner](http://www.eclipse.org/forums/index.php/mv/msg/541004/1127312/#msg_1127312)

## Details

### Extra features

CoffeeScript is a dynamic language,
 the parser doesn't check the types or even the existence of variables,
 such mismatches are detected at runtime.
This plugin is based on XText which is geared to static languages,
 providing some useful tools for dealing with these issues.
Doing proper type inference for such a flexible language would be difficult,
 but there are some cases where more checking can be done than by the original CoffeeScript parser.
Consider this snippet

    foo = 1
    bar = foo + increment

It is perfectly valid code, the `increment` variable is undefined, though.
This plugin will issue a warning about a reference to an unknown variable.
It works within string interpolation, too, so the next snippet will also give a warning

    console.log "Incremented by ${ increment }"

Note that the `console` variable won't cause any warning, it's handled as a built-in variable.

### Incompatibilities

The plugin handles properly most language constructs,
 including all examples in the coffeescript documentation folder.
There are two cases it cannot handle, though, post-increment and
assignment to a deeply nested property.

    # Not working
    drinkBeer(glasses++)  

    # Workaround
    drinkBeer(glasses)
    glasses += 1

    # Not working
    my.secret.money = 1000

    # Workaround
    tmp = my.secret
    tmp.money = 1000

I guess they don't hurt that much...
Getting the value of a deeply nested property is OK.

    # This is working
    borrow(my.secret.money)
    borrowed = my.secret.money

## Installation

in a word: drag-and-drop
<a href="http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=1097343" title="Drag and drop into a running Eclipse to install Nodeclipse CoffeeScript Editor">
  <img src="http://marketplace.eclipse.org/sites/all/modules/custom/marketplace/images/installbutton.png"/>
</a>

1. Get [Enide Studio](http://www.nodeclipse.org/enide/studio/) from <http://sourceforge.net/projects/nodeclipse/files/Enide-Studio/>
or latest Eclipse Kepler from <http://www.eclipse.org/downloads/>.
2. [Enide Studio](http://www.nodeclipse.org/enide/studio/) and [Eclipse IDE for Java and DSL Developers](http://www.eclipse.org/downloads/packages/eclipse-ide-java-and-dsl-developers/keplerr)
both have required XText. Any Eclipse from <http://www.eclipse.org/downloads/> can actually download the dependency automatically.
For Eclipse version before Kepler there is [quick installer on Marketplace](http://marketplace.eclipse.org/content/coffeescript-editor-quick-installer).
3. Use drag-and-drop
<a href="http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=1097343" title="Drag and drop into a running Eclipse to install Nodeclipse CoffeeScript Editor">
  <img src="http://marketplace.eclipse.org/sites/all/modules/custom/marketplace/images/installbutton.png"/>
</a>
or update site `http://www.nodeclipse.org/coffeescript/repository/` (for 0.3)
`http://dl.bintray.com/nodeclipse/CoffeeScriptEditor/0.4.0-201403250304/` (for 0.4)

 Below is original detailed instructions:
 
#### Installation (old way 0.2.2) 

You will need an Eclipse instance with Xtext plugins.
You can either install a complete Indigo distribution with Xtext,
 or install the required plugins into your existing workspace.
See [download Xtext 2.1][xtext_download] for details.

The update site is: **`http://coffeescript-editor.eclipselabs.org.codespot.com/hg/`**
So in Eclipse, perform these steps

 - `Help -> Install New Software...` 
 - `Add...`, then use this url as Location
 - `Work with...`, and choose the location you just added
 - Select `Coffeescript editor`
 - `Next` and `Finish`

You may be [given a warning](https://bitbucket.org/adamschmideg/coffeescript-eclipse/issue/6/),
 but that won't affect the plugin.

## TODO

- make grouping and error warning as optional and disable by default (Reason: there are a lot of tiny problem, false error detection.
 They are distracting developer.)

## Changelog

Check [devjournal.md](https://github.com/Nodeclipse/coffeescript-eclipse/blob/master/devjournal.md)

- 0.4.0 Merged Pull Request from Matt Tucker ["When indenting, respect Eclipse editor preferences for tabs/spaces"](https://github.com/Nodeclipse/coffeescript-eclipse/pull/23)
- 0.3.0 refresh release
	- switch to maven/tycho build
	- coffee icon

<dl>
  <dt>0.2.2</dt>
  <dd>Embed coffeescript in a DSL (see the `example` directory)</dd>
  <dt>Planned next release</dt>
  <dd>Integrated build: convert coffee code to javascript, and run it</dd>
</dl>

## Building

### Maven build

[Maven](http://maven.apache.org/) build (using [Tycho plugin](http://eclipse.org/tycho/)) is headless build, that doesn't require Eclipse.

From base folder just run `mvn package`. Run offline when to re-build `mvn clean package -o`. 

#### Install site.zip (quick and simple way)

1. Locate zip file under `org.nodeclipse.site\target` in Project Explorer, StartExplore-> Copy Resource Path to Clipboard
2. Help -> Install New Software ...
3. <kbd>Add...</kbd>
4. <kbd>Archive...</kbd>
5. Insert copied string into name and path.  
 E.g. `C:\Users\pverest\git\coffeescript-eclipse\csep.site\target\csep.site-0.4.0-SNAPSHOT.zip`
 
For the next time just select the zip entry from Work With drop-down list. 

#### Install from freshly built p2 repository (cool and long way)

1. `mvn package` or `mvn package -o` for re-build offline
2. `npm install http-server -g`  
3. `http-server csep.site\target\repository -p 8010`
4. // start http://localhost:8010/  
5. // navigate `http://localhost:8010/` in browser to check  
5. Help->Install New Software, enter http://localhost:8010/ in Work With field

## Building in eclipse (old way)

If you want to contribute to the plugin, here's a quick overview how to setup and build it locally:

1. Install [http://www.eclipse.org/Xtext/download.html](Xtext) / Version 2.1.x
2. Clone this repository
3. Import all projects into your workspace
4. Right click `csep/src/csep/CoffeeScript.xtext/CoffeeScript.xtext` -> Run as ... -> Generate Xtext language artifacts
5. Right click `example/csep.example.cake/src/csep/example/cake/Cakefile.xtext` -> Run as .. -> Generate Xtext language artifacts

After these 5 steps, the project should build without errors and you can startup a new eclipse instance and open any .coffee file using the coffeescript editor.


  [coffeescript]: http://www.coffeescript.org
  [xtext]: http://www.xtext.org
  [xtext_download]: http://www.eclipse.org/Xtext/download.html
  [csep_bitbucket_download]: https://bitbucket.org/adamschmideg/coffeescript-eclipse/downloads
  [csep_github]: https://github.com/adamschmideg/coffeescript-eclipse 

