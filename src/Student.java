class Student extends Person{
    private String name;
    public Student(String name, float height, float weight){
        super(height, weight);
        this.name= name;
    }
    public void printIntro() {
        System.out.println(name + "의 키는" + getHeight() + "cm 이고, 몸무게는" + getWeight() + "이므로 BMI 수치는" + getBMI() + "입니다.");
        System.out.println("BMI 수치는" + getBMI() + "입니다.");
    }
    public void say(){
            System.out.println("안녕");
    }
}

