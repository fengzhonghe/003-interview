package com.sy.myarray;

import java.util.Arrays;

public class MyArrayTest {

    public static void main(String[] args) {

        int[] arr = {66, 33, 44, 2, 22, 99};

        //冒泡
        //bubbleSort(arr);
        //选择
        selectSort(arr);


        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    /*
     *
     * 选择排序
     *
     * */
    public static void selectSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            int minValueIndex = i;// 用来记录最小值的索引位置，默认值为i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minValueIndex] > arr[j]) {
                    //一轮下标记录
                    minValueIndex = j;
                }
            }
            //交换位置：第一大轮选出最小值后，交换位至首
            if (i != minValueIndex) {
                temp = arr[i];/*数组的起始位置放最小值*/
                arr[i] = arr[minValueIndex];
                arr[minValueIndex] = temp;
            }
        }
    }


    /*
     *
     * 冒泡排序
     *
     * */
    public static void bubbleSort(int[] arr) {
        //冒泡排序法
        int temp;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    //大的往后换
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /*
     *问题1：
     *  git clone代码后， java文件无法识别问题：build 一下即可
     * 问题2：
     *  git中两个不同开发成员是以什么来确定的？  不同电脑？还是不同秘钥？ 还是？
     *
     * */



}