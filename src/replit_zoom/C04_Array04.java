package replit_zoom;

public class C04_Array04 {
    public static void main(String[] args) {

/*
        Beklenen Çıktı:
```

```
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0
        0  0  0  0  0  0  0  0  0  0

*/
        int [] arr =new int[10];

        for (int each:arr) {
            for (int each2:arr) {
                System.out.print(each2+"  ");

            }
            System.out.println();

        }


    }
}
