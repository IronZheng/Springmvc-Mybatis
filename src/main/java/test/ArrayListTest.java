package test;

import org.apache.poi.ss.formula.functions.Na;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by User on 2017/3/6.
 */
public class ArrayListTest {

    @Test
    public static void main(String[] args) {
        List<Name> nameArray = new ArrayList<Name>();
        nameArray.add(new Name("John", "Lennon"));

        nameArray.add(new Name("Karl", "Marx"));
        nameArray.add(new Name("Groucho", "Marx"));
        nameArray.add(new Name("Oscar", "Grouch"));

        for (Name m : nameArray) {
            System.out.println(m.getFirstName() + "\t+++" + m.getLastName());
        }
        Collections.sort(nameArray);
        for (Name m : nameArray) {
            System.out.println(m.getFirstName() + "\t" + m.getLastName());
        }
    }
}

class Name implements Comparable<Name> {
    public String firstName, lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int compareTo(Name o) { // 实现接口
        int lastCmp = lastName.compareTo(o.lastName);
        // 首先比较姓(lastName)如果姓相同(lastCmp==0)再比较名(firstName)，否则返回名的比较
        return (lastCmp == 0 ? firstName.compareTo(o.firstName) : lastCmp);
    }

    public String toString() { // 便于输出测试
        return firstName + " " + lastName;
    }
}


