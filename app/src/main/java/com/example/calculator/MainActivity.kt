package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.RuntimeException

class MainActivity : AppCompatActivity() {
    lateinit var primaryTv:TextView
    lateinit var seconadyTv:TextView
    lateinit var  btnCn:Button
    lateinit var  btnC:Button
    lateinit var  btnopenButt:Button
    lateinit var  btnclosedButt:Button
    lateinit var  btnSin:Button
    lateinit var  btnCos:Button
    lateinit var  btnTan:Button
    lateinit var  btnLog:Button
    lateinit var  btnFact:Button
    lateinit var  btnSquare:Button
    lateinit var  btnroot:Button
    lateinit var  btnInve:Button
    lateinit var  btnDivi:Button
    lateinit var  btn7:Button
    lateinit var  btn8:Button
    lateinit var  btn9:Button
    lateinit var  btnx:Button
    lateinit var  btn4:Button
    lateinit var  btn5:Button
    lateinit var  btn6:Button
    lateinit var  btnmin:Button
    lateinit var  btn1:Button
    lateinit var  btn2:Button
    lateinit var  btn3:Button
    lateinit var  btnAdd:Button
    lateinit var  btnPie:Button
    lateinit var  btn0:Button
    lateinit var  btnDot:Button
    lateinit var  btnEqual:Button
    lateinit var  btnIn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        primaryTv=findViewById(R.id.primaryTv)
        seconadyTv=findViewById(R.id.secondaryTv)
        btnCn=findViewById(R.id.idBtnAc)
        btnC=findViewById(R.id.idBtnC)
        btnopenButt=findViewById(R.id.idOpenBracket)
        btnclosedButt=findViewById(R.id.idClosedButton)
        btnSin=findViewById(R.id.idBtnSin)
        btnCos=findViewById(R.id.idBtnCos)
        btnTan=findViewById(R.id.idBtnTan)
        btnLog=findViewById(R.id.idBtnLog)
        btnFact=findViewById(R.id.idBtnFac)
        btnSquare=findViewById(R.id.idBtnSqua)
        btnroot=findViewById(R.id.idBtnUnderRoot)
        btnInve=findViewById(R.id.idBtnInverse)
        btnDivi=findViewById(R.id.idBtnDiv)
        btn7=findViewById(R.id.idBtn7)
        btn8=findViewById(R.id.idBtn8)
        btn9=findViewById(R.id.idBtn9)
        btn4=findViewById(R.id.idBtn4)
        btn5=findViewById(R.id.idBtn5)
        btn6=findViewById(R.id.idBtn6)
        btn3=findViewById(R.id.idBtn3)
        btn2=findViewById(R.id.idBtn2)
        btn1=findViewById(R.id.idBtn1)
        btn0=findViewById(R.id.idBtn0)
        btnAdd=findViewById(R.id.idBtnAdd)
        btnmin=findViewById(R.id.idBtnDiff)
        btnx=findViewById(R.id.idBtnMulti)
        btnPie=findViewById(R.id.idBtnPie)
        btnEqual=findViewById(R.id.idBtnEqual)
        btnDot=findViewById(R.id.idBtnDot)
        btnIn=findViewById(R.id.idBtnIn)
        btn0.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+"0")
        }
        btn1.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+"1")
        }
        btn2.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+"2")
        }
        btn3.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+"3")
        }
        btn4.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+"4")
        }
        btn5.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+"5")
        }
        btn6.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+"6")
        }
        btn7.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+"7")
        }
        btn8.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+"8")
        }
        btn9.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+"9")
        }
        btnDot.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+".")
        }
        btnAdd.setOnClickListener{
            val str:String=primaryTv.text.toString()
            if(!str.get(index = str.length-1).equals("-")){
                primaryTv.text=(primaryTv.text.toString()+"+")
            }
        }
        btnmin.setOnClickListener{
            val str:String=primaryTv.text.toString()
            if(!str.get(index = str.length-1).equals("-")){
                primaryTv.text=(primaryTv.text.toString()+"-")
            }
        }
        btnx.setOnClickListener{
            val str:String=primaryTv.text.toString()
            if(!str.get(index = str.length-1).equals("*")){
                primaryTv.text=(primaryTv.text.toString()+"*")
            }
        }
//        btnDivi.setOnClickListener{
//            val str:String=primaryTv.text.toString()
//            if(!str.get(index = str.length-1).equals("/")){
//                primaryTv.text=(primaryTv.text.toString()+"/")
//            }
//        }
        btnPie.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+"3.14")
            seconadyTv.text=(seconadyTv.text.toString())
        }
        btnopenButt.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+"(")
        }
        btnclosedButt.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+")")
        }
        btnSin.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+"sin")
        }
        btnCos.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+"cos")
        }
        btnTan.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+"tan")
        }
        btnLog.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+"log")
        }
        btnInve.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+"^"+"(-1)")
        }
        btnIn.setOnClickListener{
            primaryTv.text=(primaryTv.text.toString()+"In")
        }
        btnSquare.setOnClickListener{
            if(primaryTv.text.toString().isEmpty()){
                Toast.makeText(this,"Please make a valid choice",Toast.LENGTH_LONG).show()
            }
            else{
                val str: String = primaryTv.text.toString()
                val r=Math.sqrt(str.toDouble())
                val result=r.toString()
                primaryTv.text=result
            }
        }
        btnCn.setOnClickListener {
            primaryTv.text = ""
            seconadyTv.text = ""
        }
        btnC.setOnClickListener{
            var str:String= primaryTv.text.toString()
            if(!str.equals("")){
                str = str.substring(0, str.length - 1)
                primaryTv.text=str
            }
        }
        btnSquare.setOnClickListener{
            if(primaryTv.text.toString().isEmpty()){
                Toast.makeText(this,"Please make a valid choice",Toast.LENGTH_LONG).show()
            }
            else {
                val str: String = primaryTv.text.toString()
              val d:Double=str.toDouble()
                val square=d*d
                primaryTv.text=square.toString()
                seconadyTv.text=square.toString()
            }

        }
        btnFact.setOnClickListener{
            if(primaryTv.text.toString().isEmpty()){
                Toast.makeText(this,"Please make a valid choice",Toast.LENGTH_SHORT).show()
            }
            else{
                val value=primaryTv.text.toString().toInt()
                val fact:Int=factorial(value)
                primaryTv.text=fact.toString()
                seconadyTv.text=fact.toString()
            }
        }
        btnEqual.setOnClickListener{
            val str:String=primaryTv.text.toString()
            val result:Double=evaluate(str)
            val r=result.toString()
            primaryTv.text=r
            seconadyTv.text=str
        }

    }

   fun evaluate(str: String): Double{
       return object: Any(){
           var pos=-1
           var ch=0

           fun nextChar(){
               ch=if(++pos<str.length)str[pos].toInt()else -1
           }
           fun eat(charToEdt: Int): Boolean{
               while(ch==' '.toInt())nextChar()

               if(ch==charToEdt){
                   nextChar()
                   return true
               }
               return false
           }
           fun parse(): Double{
               nextChar()
               val x=parseExpresion()
               if(pos<str.length)throw RuntimeException("Unexpected: "+ch.toChar())
               return  x
           }
           fun parseExpresion():Double{
               var x=parseTerm()
               while(true){
                   if(eat('+'.toInt()))x +=parseFactor()
                   else if(eat('-'.toInt()))x -=parseFactor()
                   else return x
               }
           }
           fun parseTerm():Double{
               var x= parseFactor()

               while(true){
                   if(eat('*'.toInt()))x *=parseFactor()
                    else if(eat('/'.toInt()))x/=parseTerm()
                   else return x
               }
           }
           fun parseFactor(): Double {
               //on below line we are checking for addition
               // and subtraction and performing unary operations.
               if (eat('+'.toInt())) return parseFactor() // unary plus
               if (eat('-'.toInt())) return -parseFactor() // unary minus
               // creating a double variable for ans.
               var x: Double
               // on below line we are creating
               // a variable for position.
               val startPos = pos
               // on below line we are checking
               // for opening and closing parenthesis.
               if (eat('('.toInt())) { // parentheses
                   x = parseExpresion()
                   eat(')'.toInt())
               } else if (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) {
                   // numbers
                   while (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) nextChar()
                   // on below line we are getting sub string from our string using start and pos.
                   x = str.substring(startPos, pos).toDouble()
               } else if (ch >= 'a'.toInt() && ch <= 'z'.toInt()) {
                   // on below function we are checking for the operator in our expression.
                   while (ch >= 'a'.toInt() && ch <= 'z'.toInt()) nextChar()
                   val func = str.substring(startPos, pos)
                   // calling a method to parse our factor.
                   x = parseFactor()
                   // on below line we are checking for square root.
                   x =
                       if (func == "sqrt") Math.sqrt(x)
                       // on below line we are checking for sin function
                       // and calculating sin function using Math class.
                       else if (func == "sin") Math.sin(
                           Math.toRadians(x)
                           // on below line we are calculating the cos value
                       ) else if (func == "cos") Math.cos(
                           Math.toRadians(x)
                           // on below line we are calculating
                           // the tan value of our expression.
                       ) else if (func == "tan")
                           Math.tan(Math.toRadians(x))
                       // on below line we are calculating
                       // log value of the expression.
                       else if (func == "log")
                           Math.log10(x)
                       // on below line we are calculating
                       // ln value of expression.
                       else if (func == "ln") Math.log(x)
                       // f we get any error then
                       // we simply return the exception.
                       else throw RuntimeException(
                           "Unknown function: $func"
                       )
               } else {
                   // if the condition not satisfy then we are returning the exception
                   throw RuntimeException("Unexpected: " + ch.toChar())
               }
               // on below line we are calculating the power of the expression.
               if (eat('^'.toInt())) x = Math.pow(x, parseFactor()) // exponentiation
               return x
           }
       }.parse()

    }

    private fun factorial(n: Int): Int {
    return if(n==1||n==0)1 else n * factorial(n - 1)
    }
}