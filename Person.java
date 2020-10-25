package chapter10.person;

class Person {

    private String  name;
    private int     age;
    private char    gender; //'F','M'

    public Person() {
    	
    }
    public Person(String n, int a, char g) {
        age    = a;
        name   = n;
        gender = g;
    }
    public int getAge( ) {
        return age;
    }
    public char getGender( ) {
        return gender;
    }
    public String getName( ) {
        return name;
    }
    public void setAge( int age ) {
        this.age = age;
    }
    public void setGender( char gender ) {
        this.gender = gender;
    }
    public void setName( String name ) {
        this.name = name;
    }
}