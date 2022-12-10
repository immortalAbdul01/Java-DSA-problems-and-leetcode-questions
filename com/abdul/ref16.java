package com.abdul;

import java.util.ArrayList;
import java.util.List;

public class ref16 {
    public static void printPermutationBackTracking(String str, String name, int idx){
        if (str.length()==0) { // this is a base case when the length of string become zero we are
                              // printing the name string because it was updated as new string

            System.out.println(name);
            return; // here we are returning from the function
        }
        for (int i = 0 ; i< str.length();i++){ // using for loop to get all the characters from a string
            char CurrentCh=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1); // we have taken the first character now we have to remove it so
            // we are using here substring that will take all the characters except the first one
            printPermutationBackTracking(newStr,name+CurrentCh,idx+1); // now updating the string as new string add c
            // current character in the name string
        }
    }
    //N Queens Hot Question
    public  boolean issafe(char[][]board,int row , int col ){
        // horizontal check
        for(int j=0 ;j<board.length;j++){
           if (board[row][j]=='Q'){
               return false ;
           }
        }
        // verticle check
        for (int i = 0 ; i<board.length;i++){
            if (board[i][col] == 'Q') {
                return false;
            }}
        // upper right
        int r= row ;
        for(int c=col;c<board.length&& r>0  ;r--,c++ ){
            if( board[r][c]=='Q'){
            return false;
            }
        }
        // upper left
         r = row;
        for(int c = col ; r>0&&c>0;r--,c--){
            if( board[r][c]=='Q'){
                return false;
            }
        }
        // downright
        r = row ;
        for(int c = col ; r<board.length&&c< board.length;c++,r++){
            if( board[r][c]=='Q'){
                return false;
            }
        }
//        downleft
        r = row;
        for(int c= col; c>0&&r< board.length;c--,r++){
            if( board[r][c]=='Q'){
                return false;
            }
        }
        return true;
    }
public void saveBoard(char [][] board , List<List<String>> allBoards){
        String row="";
        List<String>nBoard=new ArrayList<>();
        for (int i =0 ;i< board.length;i++){
            row="";
            for (int j = 0 ;j< board[0].length;j++){
                if(board[i][j]=='Q'){
                    row+='Q';
                }
                else {
                    row+='.';
                }
                nBoard.add(row);

            }
        }
        allBoards.add(nBoard);
}
public void helper(char[][]board,List<List<String>>allBoard,int col){
    if (col == board.length) {
        saveBoard(board,allBoard);
return;
    }
    for(int row =0 ;row<board.length;row++){
        if (issafe(board, row, col)) {
            board[row][col]='Q';
            helper(board,allBoard,col+1);
            board[row][col]='.';

        }
    }
}

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBoards, 0);
        return allBoards;
    }


    public static void main(String[] args) {
        System.out.println("This is for backtracking");
        // backtracking question 1
        printPermutationBackTracking("ABD","",0);// time complexity will be O(n*n!)



    }
}
