
public class Reader {
String name;
int age;
char sex;

public Reader(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

public void getInfo() {
    System.out.println("Reader's name=" + name + "/ Reader's age=" + age + "/ Reader'sex=" + sex);

}

void read(Book book) {
    if (book.currentPage == 0) System.out.println(name + " has not started to read the book that name is " + book.title + "yet.");
    else if (book.currentPage == book.page)
        System.out.println(name + " finish the book that name is " +  book.title );
    else
        System.out.println(name + " is on  " + book.currentPage + "th page of the book that name is  " + book.title);
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

public char getSex() {
	return sex;
}

public void setSex(char sex) {
	this.sex = sex;
}





}

