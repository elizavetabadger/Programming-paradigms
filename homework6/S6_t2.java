/*Реализовать процедуру для вычисления MSE на любом языке в любой парадигме. Программа получает
на вход два вектора и возвращает число - оценку MSE для этих векторов.
 */

 public class MSECalculator {
    
    public static double calculateMSE(double[] vector1, double[] vector2) {
        if(vector1.length != vector2.length) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }
        
        double sum = 0.0;
        for(int i = 0; i < vector1.length; i++) {
            sum += Math.pow(vector1[i] - vector2[i], 2);
        }
        
        return sum / vector1.length;
    }
    
    public static void main(String[] args) {
        double[] vector1 = {1.0, 2.0, 3.0};
        double[] vector2 = {4.0, 5.0, 6.0};
        
        double mse = calculateMSE(vector1, vector2);
        System.out.println("MSE: " + mse);
    }
}

/*Выбрана парадигма процедурного типа, потому что она простая и подходит для решения данной задачи без необходимости использования ООП.
Она позволяет легко реализовать алгоритм вычисления MSE без необходимости создания сложной структуры классов и объектов.*/