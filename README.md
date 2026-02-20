# CS-3090-Block-2-Project
Simple (and often incorrect) password strength checker. The purpose of this password checker is to highlight the failure of many websites to actually facilitate strong password creation with their users.
My program asks the user for their password, then runs it through a simple set of checks to determine: length, presence of uppercase letters, presence of lowercase letters, presence of numbers, presence of special characters, and the length of the password.

RUNNING THE PROGRAM:
  There are no dependencies for this code.
  To run this program, download the Main.java file, then go into your command prompt and navigate to the file's location on your computer in the terminal.
  Once there, run:
    javac Main.java
  If successful, the directory where the program is stored on your computer will have a Main.class file.
  Once that happens, run:
    java Main
  Then, run through the program to determine if it finds your password strong or not.

This tool is for educational use only and should not be used for determining if a password is strong or weak.
A perfect example of where this program goes wrong is that it determines that the password P@ssword1234 is strong, when it is clearly not.
There are a few more notes in the comment at the top of the Main.java file.

When thinking about the ethical considerations and responsible use of this tool, I come to the conclusion that this tool could be misused by bad actors to help them think about how to write a program that could easily narrow down the potential options of passwords
  that people might end up with since websites require so little of them. On the flip side, someone might look at this and reconsider a password that they have accepted as good enough in the past and modify it for more security in the future.
