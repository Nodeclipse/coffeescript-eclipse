package csep.tests.coffee;

import csep.tests.ParserTestBase;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Test;

/**
 * Files from {@link https://github.com/jashkenas/coffee-script/tree/master/documentation/coffee}
 * converted to test cases
 * @author adam
 */
@SuppressWarnings("all")
public class Showcase extends ParserTestBase {
  @Test
  public void test_scope() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("outer = 1");
    _builder.newLine();
    _builder.append("changeNumbers = ->");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("inner = -1");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("outer = 10");
    _builder.newLine();
    _builder.append("inner = changeNumbers()");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_interpolation() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("author = \"Wittgenstein\"");
    _builder.newLine();
    _builder.append("quote  = \"A picture is a fact. -- #{ author }\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("sentence = \"#{ 22 / 7 } is a decent approximation of \ufffd\ufffd\"");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_expressions_try() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("alert(");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("try");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("nonexistent / undefined");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("catch error");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"And the error is ... #{error}\"");
    _builder.newLine();
    _builder.append(")");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_embedded() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("hi = `function() {");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("return [document.title, \"Hello JavaScript\"].join(\": \");");
    _builder.newLine();
    _builder.append("}`");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_object_extraction() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("futurists =");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("sculptor: \"Umberto Boccioni\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("painter:  \"Vladimir Burliuk\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("poet:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("name:   \"F.T. Marinetti\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("address: [");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("\"Via Roma 42R\"");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("\"Bellagio, Italy 22021\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("{poet: {name, address: [street, city]}} = futurists");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_prototypes() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("String::dasherize = ->");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("this.replace /_/g, \"-\"");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_range_comprehensions() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("countdown = (num for num in [10..1])");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_array_comprehensions() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Eat lunch.");
    _builder.newLine();
    _builder.append("eat food for food in [\'toast\', \'cheese\', \'wine\']");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Fine dining");
    _builder.newLine();
    _builder.append("courses = [\'salad\', \'entree\', \'dessert\']");
    _builder.newLine();
    _builder.append("menu index + 1, dish for dish, index in courses");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Health conscious meal");
    _builder.newLine();
    _builder.append("foods = [\'broccoli\', \'spinach\', \'chocolate\']");
    _builder.newLine();
    _builder.append("eat food for food in foods when food isnt \'chocolate\'");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_cake_tasks() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("fs = require \'fs\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("option \'-o\', \'--output [DIR]\', \'directory for compiled code\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("task \'build:parser\', \'rebuild the Jison parser\', (options) ->");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("require \'jison\'");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("code = require(\'./lib/grammar\').parser.generate()");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("dir  = options.output or \'lib\'");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("fs.writeFile \"#{dir}/parser.js\", code");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_heredocs() {
    String _plus = ("html = " + 
      "  \'\'\'");
    String _plus_1 = (_plus + 
      "    <strong>");
    String _plus_2 = (_plus_1 + 
      "      cup of coffeescript");
    String _plus_3 = (_plus_2 + 
      "    </strong>");
    String _plus_4 = (_plus_3 + 
      "  \'\'\'");
    this.ok(_plus_4);
  }
  
  @Test
  public void test_patterns_and_splats() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("tag = \"<impossible>\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("[open, contents..., close] = tag.split(\"\")");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_objects_and_arrays() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("song = [\"do\", \"re\", \"mi\", \"fa\", \"so\"]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("singers = {Jagger: \"Rock\", Elvis: \"Roll\"}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("bitlist = [");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("1, 0, 1");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("0, 0, 1");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("1, 1, 0");
    _builder.newLine();
    _builder.append("]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("kids =");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("brother:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("name: \"Max\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("age:  11");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("sister:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("name: \"Ida\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("age:  9");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_try() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("try");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("allHellBreaksLoose()");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("catsAndDogsLivingTogether()");
    _builder.newLine();
    _builder.append("catch error");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("print error");
    _builder.newLine();
    _builder.append("finally");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("cleanUp()");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_expressions() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("grade = (student) ->");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("if student.excellentWork");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"A+\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("else if student.okayStuff");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if student.triedHard then \"B\" else \"B-\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("else");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("\"C\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("eldest = if 24 > 21 then \"Liz\" else \"Ike\"");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_default_args() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("fill = (container, liquid = \"coffee\") ->");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"Filling the #{container} with #{liquid}...\"");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_multiple_return_values() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("weatherReport = (location) ->");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("# Make an Ajax request to fetch the weather...");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("[location, 72, \"Mostly Sunny\"]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("[city, temp, forecast] = weatherReport \"Berkeley, CA\"");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_fat_arrow() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Account = (customer, cart) ->");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("@customer = customer");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("@cart = cart");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("$(\'.shopping_cart\').bind \'click\', (event) =>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@customer.purchase @cart");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_aliases() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("launch() if ignition is on");
    _builder.newLine();
    _builder.newLine();
    _builder.append("volume = 10 if band isnt SpinalTap");
    _builder.newLine();
    _builder.newLine();
    _builder.append("letTheWildRumpusBegin() unless answer is no");
    _builder.newLine();
    _builder.newLine();
    _builder.append("if car.speed < limit then accelerate()");
    _builder.newLine();
    _builder.newLine();
    _builder.append("winner = yes if pick in [47, 92, 13]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("print inspect \"My name is #{@name}\"");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_expressions_comprehension() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# The first ten global properties.");
    _builder.newLine();
    _builder.newLine();
    _builder.append("globals = (name for name of window)[0...10]");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_switch() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("switch day");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("when \"Mon\" then go work");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("when \"Tue\" then go relax");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("when \"Thu\" then go iceFishing");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("when \"Fri\", \"Sat\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("if day is bingoDay");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("go bingo");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("go dancing");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("when \"Sun\" then go church");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("else go work");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_soaks() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("zip = lottery.drawWinner?().address?.zipcode");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_expressions_assignment() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("six = (one = 1) + (two = 2) + (three = 3)");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_object_comprehensions() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("yearsOld = max: 10, ida: 9, tim: 11");
    _builder.newLine();
    _builder.newLine();
    _builder.append("ages = for child, age of yearsOld");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"#{child} is #{age}\"");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_slices() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("numbers = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("copy    = numbers[0...numbers.length]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("middle  = copy[3..6]");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_overview() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Assignment:");
    _builder.newLine();
    _builder.append("number   = 42");
    _builder.newLine();
    _builder.append("opposite = true");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Conditions:");
    _builder.newLine();
    _builder.append("number = -42 if opposite");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Functions:");
    _builder.newLine();
    _builder.append("square = (x) -> x * x");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Arrays:");
    _builder.newLine();
    _builder.append("list = [1, 2, 3, 4, 5]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Objects:");
    _builder.newLine();
    _builder.append("math =");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("root:   Math.sqrt");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("square: square");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("cube:   (x) -> x * square x");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Splats:");
    _builder.newLine();
    _builder.append("race = (winner, runners...) ->");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("print winner, runners");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Existence:");
    _builder.newLine();
    _builder.append("alert \"I knew it!\" if elvis?");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Array comprehensions:");
    _builder.newLine();
    _builder.append("cubes = (math.cube num for num in list)");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_block_comment() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("###");
    _builder.newLine();
    _builder.append("CoffeeScript Compiler v1.1.3");
    _builder.newLine();
    _builder.append("Released under the MIT License");
    _builder.newLine();
    _builder.append("###");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_do() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for filename in list");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("do (filename) ->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("fs.readFile filename, (err, contents) ->");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("compile filename, contents.toString()");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_conditionals() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("mood = greatlyImproved if singing");
    _builder.newLine();
    _builder.newLine();
    _builder.append("if happy and knowsIt");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("clapsHands()");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("chaChaCha()");
    _builder.newLine();
    _builder.append("else");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("showIt()");
    _builder.newLine();
    _builder.newLine();
    _builder.append("date = if friday then sue else jill");
    _builder.newLine();
    _builder.newLine();
    _builder.append("options or= defaults");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_functions() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("square = (x) -> x * x");
    _builder.newLine();
    _builder.append("cube   = (x) -> square(x) * x");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_strings() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("mobyDick = \"Call me Ishmael. Some years ago --");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("never mind how long precisely -- having little");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("or no money in my purse, and nothing particular");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("to interest me on shore, I thought I would sail");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("about a little and see the watery part of the");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("world...\"");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_splats() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("gold = silver = rest = \"unknown\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("awardMedals = (first, second, others...) ->");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("gold   = first");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("silver = second");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("rest   = others");
    _builder.newLine();
    _builder.newLine();
    _builder.append("contenders = [");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"Michael Phelps\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"Liu Xiang\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"Yao Ming\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"Allyson Felix\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"Shawn Johnson\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"Roman Sebrle\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"Guo Jingjing\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"Tyson Gay\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"Asafa Powell\"");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"Usain Bolt\"");
    _builder.newLine();
    _builder.append("]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("awardMedals contenders...");
    _builder.newLine();
    _builder.newLine();
    _builder.append("alert \"Gold: \" + gold");
    _builder.newLine();
    _builder.append("alert \"Silver: \" + silver");
    _builder.newLine();
    _builder.append("alert \"The Field: \" + rest");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_classes() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class Animal");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("constructor: (@name) ->");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("move: (meters) ->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("alert @name + \" moved #{meters}m.\"");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class Snake extends Animal");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("move: ->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("alert \"Slithering...\"");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("super 5");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("class Horse extends Animal");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("move: ->");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("alert \"Galloping...\"");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("super 45");
    _builder.newLine();
    _builder.newLine();
    _builder.append("sam = new Snake \"Sammy the Python\"");
    _builder.newLine();
    _builder.append("tom = new Horse \"Tommy the Palomino\"");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("sam.move()");
    _builder.newLine();
    _builder.append("tom.move()");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_splices() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("numbers = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
    _builder.newLine();
    _builder.newLine();
    _builder.append("numbers[3..6] = [-3, -4, -5, -6]");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_objects_reserved() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("$(\'.account\').attr class: \'active\'");
    _builder.newLine();
    _builder.newLine();
    _builder.append("log object.class");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_comparisons() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("cholesterol = 127");
    _builder.newLine();
    _builder.newLine();
    _builder.append("healthy = 200 > cholesterol > 60");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_while() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("# Econ 101");
    _builder.newLine();
    _builder.append("if this.studyingEconomics");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("buy()  while supply > demand");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("sell() until supply > demand");
    _builder.newLine();
    _builder.newLine();
    _builder.append("# Nursery Rhyme");
    _builder.newLine();
    _builder.append("num = 6");
    _builder.newLine();
    _builder.append("lyrics = while num -= 1");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("\"#{num} little monkeys, jumping on the bed.");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("One fell out and bumped his head.\"");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_heregexes() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("OPERATOR = /// ^ (");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("?: [-=]>             # function");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("| [-+*/%<>&|^!?=]=  # compound assign / compare");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("| >>>=?             # zero-fill right shift");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("| ([-+:])\\1         # doubles");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("| ([&|<>])\\2=?      # logic / shift");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("| \\?\\.              # soak access");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("| \\.{2,3}           # range or splat");
    _builder.newLine();
    _builder.append(") ///");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_parallel_assignment() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("theBait   = 1000");
    _builder.newLine();
    _builder.append("theSwitch = 0");
    _builder.newLine();
    _builder.newLine();
    _builder.append("[theBait, theSwitch] = [theSwitch, theBait]");
    _builder.newLine();
    this.ok(_builder);
  }
  
  @Test
  public void test_existence() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("solipsism = true if mind? and not world?");
    _builder.newLine();
    _builder.newLine();
    _builder.append("speed ?= 75");
    _builder.newLine();
    _builder.newLine();
    _builder.append("footprints = yeti ? \"bear\"");
    _builder.newLine();
    this.ok(_builder);
  }
}
