public class Person {
    private float height;
    private float weight;

    public Person (float height, float weight){
        this.height = height;
        this.weight = weight;
    }
    public float getHeight(){
        return height;
    }
    public float getWeight(){
        return weight;
    }
    public void setHeight(float height){
        this.height = height;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
    public float getBMI(){
        float heightMeter = height/100;
        return weight / (heightMeter*heightMeter);
    };
    public void say(){
        System.out.println("응애");
    }
}
