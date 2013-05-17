This is a project to provide an Eclipse plugin for [CoffeeScript][coffeescript], using [Xtext][xtext].
Development uses Xtext 2.1.
It works as a regular Eclipse plugin (see Installation for details).
Highlights include

 - syntax highlighting
 - variable autocompletion in the current namespace
 - autoindent


# Status
> It's aimed at being mostly compatible with the original CoffeeScript project.
>There are some extra features and some missing,
 but you probably (and hopefully) won't notice the difference in everyday use.

<b>Looking for owner<b>

coffeescript-eclipse has not been updated for a year.
Paul has contacted Adam Schmideg, the original author at FORMULA 400, and got blessing for Nodeclipse
to be new home for CoffeScript Editor. Current Nodeclipse team lacks needed skills (and time) to continue the project,
but tell the world that if there will be a person willing to make maintenance release
and do some refresh (and possibly become project owner),
we will include CoffeeScript Editor into Nodeclipse distributions.

## Extra features
CoffeeScript is a dyanmic language,
 the parser doesn't check the types or even the existence of variables,
 such mismatches are detected at runtime.
This plugin is based on Xtext which is geared to static languages,
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

## Incompatibilities
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

## Changelog

<dl>
  <dt>0.2.2</dt>
  <dd>Embed coffeescript in a DSL (see the `example` directory)</dd>
  <dt>Planned next release</dt>
  <dd>Integrated build: convert coffee code to javascript, and run it</dd>
</dl>

# Installation

There is [quick installer on Marketplace](http://marketplace.eclipse.org/content/coffeescript-editor-quick-installer).
 Below is original details instructions:

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

  [coffeescript]: http://www.coffeescript.org
  [xtext]: http://www.xtext.org
  [xtext_download]: http://www.eclipse.org/Xtext/download.html
  [csep_bitbucket_download]: https://bitbucket.org/adamschmideg/coffeescript-eclipse/downloads
  [csep_github]: https://github.com/adamschmideg/coffeescript-eclipse 


# Building

If you want to contribute to the plugin, here's a quick overview how to setup and build it locally:

1. Install [http://www.eclipse.org/Xtext/download.html](Xtext) / Version 2.1.x
2. Clone this repository
3. Import all projects into your workspace
4. Right click `csep/src/csep/CoffeeScript.xtext/CoffeeScript.xtext` -> Run as ... -> Generate Xtext language artifacts
5. Right click `example/csep.example.cake/src/csep/example/cake/Cakefile.xtext` -> Run as .. -> Generate Xtext language artifacts

After these 5 steps, the project should build without errors and you can startup a new eclipse instance and open any .coffee file using the coffeescript editor.
