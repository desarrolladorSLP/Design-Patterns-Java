# Template Method

## Problem
Two different components have significant similarities,
but demonstrate no reuse of common interface or implementation.
If a change common to both components becomes necessary,
duplicate effort must be expended.


## Examples

1. Sort algorithm
Consider the problem of sorting collections with different data type.
You can write an algorithm to sort integer collections and another one
for sorting double collections, but the algorithm will be the same
just with little differences for the comparison and element swapping.
So we can write an abstract class which contains the sort algorithm
and the subclases just define the details of comparison and swapping.

![Sort algorithm](images/SortMethodExample.png)

2. Process order store
Consider the problem of making different types of orders in a store
which sells items inline and on the physical store. In both cases
the store has to process the selection, payment, optionally wrapping
for gift and make the delivery but in each case it is different.
The solution in this case consist in create an abstract class and let
define the details by the subclases.

![Game player](images/OrderProcessTemplateExample.png)

## Solution
Define the skeleton of an algorithm in an operation,
deferring some steps to client subclasses.
Template Method lets subclasses redefine certain steps of an algorithm
without changing the algorithm's structure.
Base class declares algorithm 'placeholders',
and derived classes implement the placeholders.

![Solution](images/TemplateMethodStructure.png)

## When to use the Template Design Pattern

The Template Method pattern should be used in the following cases:
- To implement the invariant parts of an algorithm once and leave it up to subclasses to implement the behavior that can vary.

- When common behavior among subclasses should be factored and localized in a common class to avoid code duplication. You first identify the differences in the existing code and then separate the differences into new operations. Finally, you replace the differing code with a template method that calls one of these new operations.

- To control subclasses extensions. You can define a template method that calls "hook" operations (see Consequences) at specific points, thereby permitting extensions only at those points.

## Rules of thumb
- The template method in base class should be restricted so
that the subclasses does not override it.

- It is better to have lesser number of methods to be implemented
by the subclasses and that will help provide an easy implementation.

- Template method design pattern uses the inverted control structure as
in “Don’t call, we will call you”.
The operations defined in subclasses are called by base class from
within the template method.

- Strategy is like Template Method except in its granularity.

- Template Method uses inheritance to vary part of an algorithm.

- Strategy uses delegation to vary the entire algorithm.

- Strategy modifies the logic of individual objects.

- Template Method modifies the logic of an entire class.

- Factory Method is a specialization of Template Method.

## References
1. [Design Patterns. Elements of reusable object-oriented software.](https://www.amazon.com.mx/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612)

2. [Agile Principles, Patterns, And Practices in C#.](https://www.amazon.com.mx/Agile-Principles-Patterns-Practices-C/dp/0131857258)

3. [Design Patterns Explained Simply.](https://sourcemaking.com/design-patterns-ebook)