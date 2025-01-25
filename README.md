# Unhandled Exception in Groovy Closure

This example demonstrates a common issue in Groovy where exceptions thrown within closures are not always handled correctly by the calling method.  The code in `bug.groovy` throws an exception within a closure, resulting in abrupt program termination. The solution demonstrates how to properly handle this using a `try-catch` block.

## How to Reproduce
1. Save the provided `bug.groovy` code.
2. Run the code using Groovy (e.g., `groovy bug.groovy`).
3. Observe the program terminates unexpectedly after printing "Inside the closure".

## Solution
The improved `bugSolution.groovy` shows how to use `try-catch` to gracefully handle the exception.