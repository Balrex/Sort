import java.util.Arrays;

public class SimpleSort<T extends Comparable<T>> implements Comparable<T> {
    T tmp;
    T tmp2;
    int[] mas_int = new int[1];
    char[] mas_char = new char[1];
    double[] mas_double = new double[1];
    String[] mas_string = new String[1];
    Object[] mas_object = new Object[1];

    public SimpleSort() {
    }

    private void interpret(int[] arr) {
        this.mas_int = arr;
        int size = arr.length;
        this.mas_object = Arrays.copyOf(mas_object, size);
        for (int i = 0; i < size; i++) {
            this.mas_object[i] = (int) arr[i];
        }
    }

    private void interpret(char[] arr) {
        this.mas_char = arr;
        int size = arr.length;
        this.mas_object = Arrays.copyOf(mas_object, size);
        for (int i = 0; i < size; i++) {
            this.mas_object[i] = (char) arr[i];
        }
    }

    private void interpret(String[] arr) {
        this.mas_string = arr;
        int size = arr.length;
        this.mas_object = Arrays.copyOf(mas_object, size);
        for (int i = 0; i < size; i++) {
            this.mas_object[i] = (String) arr[i];
        }
    }

    private void interpret(double[] arr) {
        this.mas_double = arr;
        int size = arr.length;
        this.mas_object = Arrays.copyOf(mas_object, size);
        for (int i = 0; i < size; i++) {
            this.mas_object[i] = (double) arr[i];
        }
    }

    // -------------------------------------------------------------------------------
    private void return_int() {
        for (int i = 0; i < mas_object.length; i++) {
            mas_int[i] = (int) mas_object[i];
        }
    }

    private void return_char() {
        for (int i = 0; i < mas_object.length; i++) {
            mas_char[i] = (char) mas_object[i];
        }
    }

    private void return_String() {
        for (int i = 0; i < mas_object.length; i++) {
            mas_string[i] = (String) mas_object[i];
        }
    }

    private void return_double() {
        for (int i = 0; i < mas_object.length; i++) {
            mas_double[i] = (double) mas_object[i];
        }
    }

    // --------------------------------------------------------------------------------------
    public Object[] ChoiceSort(Object[] arr, int choose) {
        this.mas_object = arr;
        if (choose == 1)
            BubbleSorter(0, arr.length);
        else if (choose == 2)
            InsertionSort(0, arr.length);
        else
            SelectionSort(0, arr.length);
        return mas_object;
    }

    public Object[] Sort(Object[] arr, int first, int second, int choose) {
        this.mas_object = arr;
        if (choose == 1)
            BubbleSorter(first, second);
        else if (choose == 2)
            InsertionSort(first, second);
        else
            SelectionSort(first, second);
        return mas_object;
    }

    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public int[] ChoiceSort(int[] arr, int choose) {
        interpret(arr);
        if (choose == 1)
            BubbleSorter(0, arr.length);
        else if (choose == 2)
            InsertionSort(0, arr.length);
        else
            SelectionSort(0, arr.length);
        return_int();
        return mas_int;
    }

    public int[] Sort(int[] arr, int first, int second, int choose) {
        interpret(arr);
        if (choose == 1)
            BubbleSorter(first, second);
        else if (choose == 2)
            InsertionSort(first, second);
        else
            SelectionSort(first, second);
        return_int();
        return mas_int;
    }

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public char[] ChoiceSort(char[] arr, int choose) {
        interpret(arr);
        if (choose == 1)
            BubbleSorter(0, arr.length);
        else if (choose == 2)
            InsertionSort(0, arr.length);
        else
            SelectionSort(0, arr.length);
        return_char();
        return mas_char;
    }
    public char[] Sort(char[] arr, int first, int second, int choose) {
        interpret(arr);
        if (choose == 1)
            BubbleSorter(first, second);
        else if (choose == 2)
            InsertionSort(first, second);
        else
            SelectionSort(first, second);
        return_char();
        return mas_char;
    }
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public String[] ChoiceSort (String[] arr, int choose){
        interpret(arr);
        if (choose==1)
            BubbleSorter(0, arr.length);
        else if (choose==2)
            InsertionSort(0, arr.length);
        else
            SelectionSort(0, arr.length);
        return_String();
        return mas_string;
    }
    public String[] Sort (String[] arr, int first, int second, int choose){
        interpret(arr);
        if (choose==1)
            BubbleSorter(first, second);
        else if (choose==2)
            InsertionSort(first, second);
        else
            SelectionSort(first, second);
        return_String();
        return mas_string;
    }
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public double[] ChoiceSort (double[] arr, int choose){
        interpret(arr);
        if (choose==1)
            BubbleSorter(0, arr.length);
        else if (choose==2)
            InsertionSort(0, arr.length);
        else
            SelectionSort(0, arr.length);
        return_double();
        return mas_double;
    }
    public double[] Sort (double[] arr, int first, int second, int choose){
        interpret(arr);
        if (choose==1)
            BubbleSorter(first, second);
        else if (choose==2)
            InsertionSort(first, second);
        else
            SelectionSort(first, second);
        return_double();
        return mas_double;
    }
// --------------------------------------------------------------------------------------
    //пузырек
    private void BubbleSorter(int first, int second) {
        Object variable;
        boolean flag = true;
        int size = mas_object.length;
        while (flag) {
            flag = false;
            for (int i = first; i < (size - 1) && i < (second - 1); i++) {
                tmp = (T) mas_object[i];
                tmp2 = (T) mas_object[i + 1];
                int comparation = compareTo(tmp2);
                if (comparation > 0) {
                    variable = mas_object[i + 1];
                    mas_object[i + 1] = mas_object[i];
                    mas_object[i] = variable;
                    flag = true;
                }
            }
        }
    }
    //пузырек для списка
    public void bubbleSort(MyList<person> original){
        boolean marker=false;
        while (!marker){
            marker=true;
            node<person> tmp2_node=original.head;
            node<person> tmp1_node=original.head.next;
            do{
                if (tmp2_node.data.compareTo(tmp1_node.data)>0) {
                    marker = false;
                    person tmp = tmp2_node.data;
                    tmp2_node.data=tmp1_node.data;
                    tmp1_node.data=tmp;
                    //System.out.println("Мы меняем");
                }
                tmp2_node=tmp1_node;
                tmp1_node=tmp1_node.next;
            }while (tmp1_node.next!=null);
        }
    }
    // сортировка вставками
    private void InsertionSort(int first, int second){
        for (int left = first; left < mas_object.length && left<second; left++) {
            tmp =(T) mas_object[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                tmp2 = (T) mas_object[i];
                int comparatoin = compareTo(tmp2);
                if (comparatoin < 0) {
                    mas_object[i + 1] = mas_object[i];
                } else
                    break;
            }
            mas_object[i + 1] = tmp;
        }
    }
    //сортировка выбором
    private void SelectionSort(int first, int second){
        for (int left = first; left < mas_object.length && left<second; left++) {
            int minInd = left;
            for (int i = left; i < mas_object.length && i<second; i++) {
                tmp = (T) mas_object[i];
                tmp2 = (T) mas_object[minInd];
                int comparation = compareTo(tmp2);
                if (comparation < 0) {
                    minInd = i;
                }
            }
            Object tmp = mas_object[left];
            mas_object[left]=mas_object[minInd];
            mas_object[minInd]=tmp;
        }
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }

  /*  @Override
    public int compareTo(T o) {
        try {
            int result = this.tmp.compareTo(o);
            return result;
        }catch (ClassCastException e){
            e.getMessage();
            return 0;
        }
    }*/
}
