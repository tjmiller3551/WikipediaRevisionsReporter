# Project Report

TJ Miller

## Markdown Tips

If you are unfamiliar with MarkDown, check out 
[the official documentation](https://guides.github.com/features/mastering-markdown/).

Note that IntelliJ IDEA has a Markdown preview that you can access in 
the upper-right of the editor. Also, since Markdown documents&mdash;like
source code&mdash;should be human-readable, make sure you keep your lines
short, as you can see I have done in my Markdown files.

Please remove this subsection before submitting your report. 

## Challenge #1 Complete

I changed one of the bindings in the Guice config class QueryEngineModule,
from FakeQueryEngine.class to be WikipediaQueryEngine.class to complete,
Challenge #1

## Challenge #2 Complete

I created a Formatter interface that I then implemented into the old formatter
and the new class FixedRevisionFormatter that I also created for the challenge.
I created a new state variable in WikipediaAnalyzer that allows the formatter to be
injected rather than declaring it somewhere else in the program.
I also chose to change the overall format of the revision by modifying DateTimeFormatter to use 
a format of standard time, standard dates, and the author of the revision.

## Challenge #3 Complete

Using the reduce function in the java Stream api, I created a resultant string that
was able to reduce the entire list into just a single string.

## Reflection Question #1: Functional vs OO

(Write one or more paragraphs comparing and contrasting the iterative and functional  
approaches to string concatenation you explored in challenge #3. Which do you
prefer, and why?)

Since my previous coursework has all focused on iterative styles of programming,
I still choose this style for my programming that I do. I do however, see the benefits
of functional programming, such as having value outputs that only depend on arguments passed
within that function, making software behave more predictably.

## Reflection Question #2: Polymorphism and Dependency Inversion

(Explain how polymorphism engendered dependency inversion in this little
application. Be clear and precise here, as this is, in part, an assessment of
your correct use of technical terminology.
Consider, for example, where exactly is polymorphism used?
Where exactly is a dependency inverted?)

In my solution, the polymorphic structure Formatter gave rise to a dependency inversion.
Rather than editing the program to allow functionality with any kind of Formatter that I
could make, I instead just make it to function with the generalized Formatter that I created.
This creates a dependency inversion because the higher order objects no longer need to rely
on any individual lower order formatter in the program.