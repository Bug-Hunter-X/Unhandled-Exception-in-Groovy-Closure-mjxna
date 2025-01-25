```groovy
def methodWithClosure(closure) {
  println "Before closure execution"
  try {
    closure() // Calling the closure within a try-catch block
  } catch (RuntimeException e) {
    println "Exception caught within the closure: "+ e.message
  }
  println "After closure execution"
}

methodWithClosure { 
  println "Inside the closure"
  // Some code here that throws an exception
  throw new RuntimeException("Something went wrong!")
}
```