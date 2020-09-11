package EqualityLogic;

public class Person implements Comparable<Person> {
    private String name;
    private  int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
       /* Person person = new Person(this.name, this.age);
        return person.compareTo(o);
        Person person = new Person(this.name, this.age);
        int res = 100;
        if (person.equals(o)){
            res  = 0;
        }else if (!person.equals(o)){
            res = 1;
        }else if (!o.equals(person)){
            res = -1;
        }
        return  res;*/
        int res = this.name.compareTo(o.name);
        if (res == 0){
            res = Integer.compare(this.age, o.age);
        }
        return res;
    }
}
