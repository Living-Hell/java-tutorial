public class JavaGarbageCollection {
    public static void main(String[] args) {
        // Types of memory:
        // 1. Stack
        // 2. Heap

        // Both stack and heap are created by JVM and stored in RAM.

        // Stack Memory:
        // Store temporary variables and separate memory block for methods
        // Store primitive data types
        // Store reference of the heap objects
        //  - Strong reference
        //  - Weak reference
        //      - Soft reference
        // Each thread has its own stack memory.
        // But all the thread share a common heap memory.
        // Variable within a scope is only visible to that scope and as soon as any variable goes out of the scope,
        // it gets deleted from the stack memory in LIFO order
        // When stack memory goes full, it throws "java.lang.StackOverflowError"

        // Generally heap has more memory than stack and has only one copy of it.
        // String literals store the data in string pool, and the string pool is saved in heap memory only.

        // Heap Memory:
        // Store objects
        // There is no order of allocating the memory.
        // Garbage collector is used to delete the unreferenced objects from the heap.
        //  - Mark and Sweep Algorithm
        //  - Types of Garbage Collector
        //      - Single GC
        //      - Parallel GC
        //      - CMS (concurrent mark Sweep) GC
        //      - G1
        // Heap memory is shared with all the threads.
        // Heap also contains the string pool.
        // When heap memory goes full, it throws "java.lang.OutOfMemoryError"
        // Heap memory is further divided into:
        //  - Young Generation (minor GC happens here)
        //      - Eden
        //      - Survivor
        //  - Old/Tenured Generation (major GC happens here)
        //  - Permanent Generation / Metaspace / Non-Heap Memory

        // When the scope of the methods is over, all the temporary variables (reference to the heap objects) are deleted.
        // To delete the heap objects, the garbage collector is used.

        // JVM controls when to run the garbage collector and the garbage collector runs periodically.

        System.gc(); // Used to run the garbage collector, but it does not guarantee it since JVM controls it.
        // It's also called automatic memory management since it happens on its own.

        // Eg. of strong reference
        // Person pObj = new Person();

        // Eg. of weak reference
        // WeakReference<Person> weakPObj = new WeakReference<Person>(new Person();
        // As soon as the garbage collector runs, it will delete the weak referenced object.
        // And if it tries to access the object after that, it will get null.

        // Eg. of soft reference
        // SoftReference<Person> softPObj = new SoftReference<Person>(new Person());
        // soft reference is similar to weak reference and the gc can delete the objects.
        // But the soft referenced objects are deleted only when its very urgent like the memory is full or something.

        // Eg. of changing the reference:
        // Person pObj = new Person();
        // pObj = null;

        // Person pObj2 = new Person();
        // pObj = pObj2;


        // Whenever a new object is created, it goes in Eden (Young Generation) and it is stored in the heap.
        // Suppose multiple objects are created. When the GC is invoked the first time,
        // it will mark all the un referenced objects using the mark and sweep algorithm.
        // After that, another GC is invoked and using the sweep algorithm, it deleted the marks object and shifts the
        // remaining objects from the Young Generation to one of the Survivor (S0 or S1) memory space and an age is added to them.
        // This process is called minor GC.
        // It happens very fast and it happens periodically.

        // Suppose new multiple objects are created.
        // Now when the GC will be called, unreferenced objects will be marked.
        // The unreferenced and unmarked objects will be removed and the remaining objects will be shifted to the Survivor.
        // At one time either one of the Survivors (S0 or S1) will be free.
        // The age of the objects will also be increased.

        // Now there's a threshold. For eg. age = 3, after which the object needs to be promoted.
        // When an object survives the threshold age, it will need to be promoted and it will be shifted to the old generation.
        // In Old generation, GC runs less frequently.
        // For eg. if in young generation, GC runs every 10 seconds, in Old generation, it runs once every half hour.
        // Garbage collector for old generation is a little bit slower than for young generation.
        // Since the objects in old generation have been alive for so long, they are used frequently and have a lot of references and are big objects.
        // While in the young generation, creation and deletion happens frequently and it's fast
        // In old generation, garbage collector process is called Major GC.

        // MetaSpace
        // It stores types of data such as class variables, class metadata, constants, etc.
        // It is not a part of the heap memory.
        // It is expandable as required.

        // Garbage collector algorithm:
        // 1. Mark and Sweep Algorithm
        // 2. Mark and Sweep with compact memory

        // In compaction, it brings the objects in a sequence instead of segments when the objects are deleted and leaves the objects occupying the memory in chunks or segments
        // This makes the addition of new object easier.

        // Different versions of GC:
        // 1. Serial GC
        // 2. Parallel GC -> Default garbage collector in JAVA 8
        // 3. Concurrent MarkSweep GC (CMS)
        // 4. GI GC

        // Serial GC:
        // It's a single thread garbage collector.
        // Only 1 thread is used and its slow and GC is very expensive.
        // Whenever the GC work starts, all the application thread gets stopped.
        // The world stops when the GC runs.
        // If the GC is slow, the application will be slow.

        // Parallel GC:
        // It's a multi-threaded garbage collector depending on the core.
        // It's faster and has less pause time.

        // CMS GC:
        // Application thread works in parallel to the GC threads and is not stopped.
        // But it's not 100% guaranteed.
        // No compaction happens here.

        // G1 GC:
        // Application thread is not stopped when GC thread works.
        // Compaction happens here.

        // Throughput is increased since there is less pause time, so more requests can be processed per minute, eg. 1500req/min
        // Latency is decreased since pause time is reduced.

















    }

}
