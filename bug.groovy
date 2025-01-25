```groovy
def methodWithClosure(closure) {
  println "Before closure execution"
  closure() // Calling the closure directly
  println "After closure execution"
}

methodWithClosure { 
  println "Inside the closure"
  // Some code here that throws an exception
  throw new RuntimeException("Something went wrong!")
}
```