public class AverageArray {
    public static void main(String[] args) {
        double harmonicSerie=0.0;
        double[] list={1,2,3,4,5};
        for (int i=0;i<list.length;i++){
            harmonicSerie+=1/list[i];
        }
        double average=list.length/harmonicSerie;
        System.out.println("Harmonic average of elements of array:"+average);
    }
}
