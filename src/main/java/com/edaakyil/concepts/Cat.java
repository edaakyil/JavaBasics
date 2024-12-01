package main.java.com.edaakyil.concepts;

public class Cat {
    private final String name;

    public Cat(String name)
    {
        this.name = name;
    }

    public class Bow {
        private final String color;

        public Bow(String color)
        {
            this.color = color;
        }

        public void printColor()
        {
            System.out.printf("The cat %s's bow color: %s%n", Cat.this.name, this.color);
        }

        @Override
        public String toString()
        {
            return "Bow class toString method";
        }
    }

    public void printInfo()
    {
        System.out.printf("Name: %s, BowColor: %n", name);
    }

    @Override
    public String toString()
    {
        return "Cat class toStringMethod";
    }
}
