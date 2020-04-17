public class Animal {
    public int size;
    public String breed,name;

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {

    }


    public void setSize(int s) {
        size = s;
    }

    void roar() {
        if (size > 80) {
            System.out.println("hello");
        } else if (size > 18) {
            System.out.println("hai");
        } else {
            System.out.println("bye");
        }
    }
}


class Animaltestdrive {
    public static void main(String[] args) {
        Animal one = new Animal();
        one.setSize(90);
        Animal two = new Animal();
        two.setSize(10);
        System.out.println("first Animal:" + one.getSize());
        System.out.println("second Animal:" + two.getSize());
        one.roar();
        two.roar();
    }
}
