/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptuan4;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ADMINISTRATOR
 */
public class Baitaptuan4Test {
    
    public Baitaptuan4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of MaxNumber method, of class Baitaptuan4.
     */
    @Test
    public void testMaxNumber() {
        // test1. 
        System.out.println("MaxNumber");
        int a = 1;
        int b = 2;
        Baitaptuan4 instance = new Baitaptuan4();
        int expResult = 2;
        int result = Baitaptuan4.MaxNumber(a, b); 
        assertEquals(expResult, result);
        // test2. 
        int a1 = 2, b1 = 3;
        int expResult1 = 3; 
        int result1 = Baitaptuan4.MaxNumber(a1, b1);
        assertEquals(expResult1, result1);
        // test3. 
        int a2 = 4, b2 = 5;
        int expResult2 = 5; 
        int result2 = Baitaptuan4.MaxNumber(a2, b2);
        assertEquals(expResult2, result2);
        // test4; 
        int a3 = 4, b3 = 5;
        int expResult3 = 5; 
        int result3 = Baitaptuan4.MaxNumber(a3, b3);
        assertEquals(expResult3, result3);
        // test5; 
        int a4 = 5, b4 = 5;
        int expResult4 = 5; 
        int result4 = Baitaptuan4.MaxNumber(a4, b4);
        assertEquals(expResult4, result4);
    }

    /**
     * Test of MinInArray method, of class Baitaptuan4.
     */
    @Test
    public void testMinInArray() {
        System.out.println("MinInArray");
        // test1. 
        ArrayList<Integer> Arr  = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            Arr.add(i); 
        }
        int expResult = 0;
        int result = Baitaptuan4.MinInArray(Arr);
        assertEquals(expResult, result);
        // test2. 
        ArrayList<Integer> Arr2  = new ArrayList<>();
        for (int i = 10; i < 20; i++){
            Arr2.add(i); 
        }
        int expResult2 = 10;
        int result2 = Baitaptuan4.MinInArray(Arr2);
        assertEquals(expResult2, result2);
        // test3. 
        ArrayList<Integer> Arr3  = new ArrayList<>();
        for (int i = 5; i < 10; i++){
            Arr3.add(i); 
        }
        int expResult3 = 5;
        int result3 = Baitaptuan4.MinInArray(Arr3);
        assertEquals(expResult3, result3);
        // test4. 
        ArrayList<Integer> Arr4  = new ArrayList<>();
        for (int i = 8; i < 10; i++){
            Arr4.add(i); 
        }
        int expResult4 = 8;
        int result4 = Baitaptuan4.MinInArray(Arr4);
        assertEquals(expResult4, result4);
        // test5. 
        ArrayList<Integer> Arr5  = new ArrayList<>();
        for (int i = 6; i < 7; i++){
            Arr5.add(i); 
        }
        int expResult5 = 6;
        int result5 = Baitaptuan4.MinInArray(Arr5);
        assertEquals(expResult5, result5);
    }
    

    /**
     * Test of main method, of class Baitaptuan4.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Baitaptuan4.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of assessmentBMI method, of class Baitaptuan4.
     */
    @Test
    public void testAssessmentBMI() {
        //test 1. 
        System.out.println("assessmentBMI");
        float weight = (float) 56;
        float height = (float) 1.5;
        Baitaptuan4 instance = new Baitaptuan4();
        String expResult = "Binh thuong"; 
        String Result =  Baitaptuan4.assessmentBMI(weight, height);
        assertEquals(expResult, Result);
        // test 2. 
        float weight1 = (float) 56;
        float height1 = (float) 1.5;
        String expResult1 = "Binh thuong"; 
        String Result1 =  Baitaptuan4.assessmentBMI(weight1, height1);
        assertEquals(expResult1, Result1);
        // test 3. 
        float weight2 = (float) 56;
        float height2 = (float) 1.5;
        String expResult2 = "Binh thuong"; 
        String Result2 =  Baitaptuan4.assessmentBMI(weight2, height2);
        assertEquals(expResult2, Result2);
        // test 4. 
        float weight3 = (float) 56;
        float height3 = (float) 1.5;
        String expResult3 = "Binh thuong"; 
        String Result3 =  Baitaptuan4.assessmentBMI(weight3, height3);
        assertEquals(expResult3, Result3);
        // test 5. 
        float weight4 = (float) 56;
        float height4 = (float) 1.5;
        String expResult4 = "Binh thuong"; 
        String Result4 =  Baitaptuan4.assessmentBMI(weight4, height4);
        assertEquals(expResult4, Result4);
    }

    /**
     * Test of main method, of class Baitaptuan4.
     */

}
