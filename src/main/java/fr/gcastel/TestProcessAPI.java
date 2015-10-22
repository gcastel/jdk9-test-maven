package fr.gcastel;

public class TestProcessAPI 
{
  public static void main(String[] args) throws Exception {
        System.out.println("Your pid is " + ProcessHandle.current().getPid());
  } 
}
