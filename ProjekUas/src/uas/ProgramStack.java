package uas;
import java.util.EmptyStackException;
public class ProgramStack {
    private Pegawai[] stack;
    private int top;

    public ProgramStack (int capacity){
        stack = new Pegawai[capacity];
    }

    public void push (Pegawai pegawai){
        if(top == stack.length){
            //resize element array
            Pegawai[] newArray = new Pegawai[2 * stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack = newArray;

        }
        stack[top++] = pegawai;
    }

    public Pegawai pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Pegawai pegawai = stack[--top];
        stack[top] = null;
        return pegawai;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public Pegawai peek(){
        if(isEmpty()){
            throw  new EmptyStackException();
        }
        return stack[top-1];
    }
    public int size(){
        return top;
    }

    public void printStack(){
        for(int i = top - 1; i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}
