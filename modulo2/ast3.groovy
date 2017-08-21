class MiSet implements Set {

  @Delegate
  Set delegate = new HashSet()

  @Override
  boolean add(i){
    println "Adding ${i}"
    delegate.add(i)
  }
}
s = new MiSet()
s.add(3)
