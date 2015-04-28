package _02_JavaInterop;

import java.util.Collection;
import java.util.Iterator;

public class _02_01_JavaClass {

    public String someMethod(Collection<Integer> collection) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            sb.append(element);
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static void justSomeStaticMethod() {

    }
}
