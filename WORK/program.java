//LINKED LIST

///////////////////////////////////////////////////////////////////////////////////////

/* 
LinkedList

Представляет собой двусвязный список.
Список – гибкая структура данных, позволяющая легко менять свой
размер. Элементы доступны для вставки или удаления в любой позиции.
*/

package WORK;

import java.util.LinkedList;

/**
 * program
 */
public class program {

    public static void main(String[] args) {

        Student2 st1 = new Student2("Ivan", 3);
        Student2 st2 = new Student2("Nikolay", 2);
        Student2 st3 = new Student2("Elena", 1);
        Student2 st4 = new Student2("Petr", 4);
        Student2 st5 = new Student2("Mariya", 3);
        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);
        System.out.println("LinkedList = " + student2LinkedList);
    }
}

class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}

/*
ОТВЕТ:
LinkedList = [Student{name='Ivan', course=3}, Student{name='Nikolay', course=2},
Student{name='Elena', course=1}, Student{name='Petr', course=4},
Student{name='Mariya',course=3}]
*/



///////////////////////////////////////////////////////////////////////////////////////

/* 
LinkedList

Элементы LinkedList - это звенья одной цепочки.
Эти элементы хранят определенные данные, а также
ссылки на предыдущий и следущий элементы
*/
///////////////////////////////////////////////////////////////////////////////////////