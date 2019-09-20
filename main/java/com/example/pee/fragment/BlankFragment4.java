package com.example.pee.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment4 extends Fragment {

    private String sub1="",sub2="",sub3="",sub4="",sub5="",sub6="",sub7="";
    private double credit[] = new double[7];
    private double gpa[] = new double[7];
    private double ans = 0;
    private double gp = 0;//credit*gp
    private double ca = 0;//credit all
    private Button button,buttonReset;
    private TextView textView;
    private EditText editTextCre1,editTextCre2,editTextCre3,editTextCre4,editTextCre5,editTextCre6,editTextCre7;
    private EditText editTextGpa1,editTextGpa2,editTextGpa3,editTextGpa4,editTextGpa5,editTextGpa6,editTextGpa7;
    private EditText editTextCa,editTextGp;

    public BlankFragment4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank_fragment4, container, false);

        button = (Button)view.findViewById(R.id.button2);
        //credit
        editTextCre1 = (EditText)view.findViewById(R.id.editText2);
        editTextCre2 = (EditText)view.findViewById(R.id.editText5);
        editTextCre3 = (EditText)view.findViewById(R.id.editText14);
        editTextCre4 = (EditText)view.findViewById(R.id.editText17);
        editTextCre5 = (EditText)view.findViewById(R.id.editText20);
        editTextCre6 = (EditText)view.findViewById(R.id.editText23);
        editTextCre7 = (EditText)view.findViewById(R.id.editText29);
        //gpa
        editTextGpa1 =(EditText)view.findViewById(R.id.editText3);
        editTextGpa2 =(EditText)view.findViewById(R.id.editText6);
        editTextGpa3 =(EditText)view.findViewById(R.id.editText15);
        editTextGpa4 =(EditText)view.findViewById(R.id.editText18);
        editTextGpa5 =(EditText)view.findViewById(R.id.editText21);
        editTextGpa6 =(EditText)view.findViewById(R.id.editText24);
        editTextGpa7 =(EditText)view.findViewById(R.id.editText30);

        buttonReset = (Button)view.findViewById(R.id.butReset);
        editTextCa = (EditText)view.findViewById(R.id.edtCa);
        editTextGp = (EditText)view.findViewById(R.id.edtGP);
        textView = (TextView)view.findViewById(R.id.textView50);

        reset();
        but1();
        return view;
    }
    private void reset()
    {
        buttonReset.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                editTextCa.setText("");
                editTextGp.setText("");
                editTextCre1.setText("");
                editTextCre2.setText("");
                editTextCre3.setText("");
                editTextCre4.setText("");
                editTextCre5.setText("");
                editTextCre6.setText("");
                editTextCre7.setText("");
                editTextGpa1.setText("");
                editTextGpa2.setText("");
                editTextGpa3.setText("");
                editTextGpa4.setText("");
                editTextGpa5.setText("");
                editTextGpa6.setText("");
                editTextGpa7.setText("");
            }
        });
    }
    private void but1()
    {

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                ca = 0;
                gp = 0;

                if(!editTextCre1.getText().toString().equals("")&&!editTextCre2.getText().toString().equals("")&&!editTextCre3.getText().toString().equals("")&&
                        !editTextCre4.getText().toString().equals("")&&!editTextCre5.getText().toString().equals("")&&!editTextCre6.getText().toString().equals("")&&
                        !editTextCre7.getText().toString().equals("")&&!editTextGpa1.getText().toString().equals("")&&!editTextGpa2.getText().toString().equals("")&&
                        !editTextGpa3.getText().toString().equals("")&&!editTextGpa4.getText().toString().equals("")&&!editTextGpa5.getText().toString().equals("")&&
                        !editTextGpa6.getText().toString().equals("")&&!editTextGpa7.getText().toString().equals(""))//no null
                {
                    try
                    {
                        credit[0] = Double.parseDouble(editTextCre1.getText().toString());
                        credit[1] = Double.parseDouble(editTextCre2.getText().toString());
                        credit[2] = Double.parseDouble(editTextCre3.getText().toString());
                        credit[3] = Double.parseDouble(editTextCre4.getText().toString());
                        credit[4] = Double.parseDouble(editTextCre5.getText().toString());
                        credit[5] = Double.parseDouble(editTextCre6.getText().toString());
                        credit[6] = Double.parseDouble(editTextCre7.getText().toString());

                        gpa[0] = Double.parseDouble(editTextGpa1.getText().toString());
                        gpa[1] = Double.parseDouble(editTextGpa2.getText().toString());
                        gpa[2] = Double.parseDouble(editTextGpa3.getText().toString());
                        gpa[3] = Double.parseDouble(editTextGpa4.getText().toString());
                        gpa[4] = Double.parseDouble(editTextGpa5.getText().toString());
                        gpa[5] = Double.parseDouble(editTextGpa6.getText().toString());
                        gpa[6] = Double.parseDouble(editTextGpa7.getText().toString());

                    }catch (Exception ex)
                    {

                    }
                    for (int i = 0; i <=6 ; i++)
                    {
                        ca = credit[i]+ca;
                    }

                    for (int i = 0; i <=6 ; i++)
                    {
                        gp = (credit[i]*gpa[i])+gp;
                    }
                    ans = gp/ca;

                }else if(!editTextCre1.getText().toString().equals("")&&!editTextCre2.getText().toString().equals("")&&!editTextCre3.getText().toString().equals("")&&
                        !editTextCre4.getText().toString().equals("")&&!editTextCre5.getText().toString().equals("")&&!editTextCre6.getText().toString().equals("")&&
                        editTextCre7.getText().toString().equals("")&&!editTextGpa1.getText().toString().equals("")&&!editTextGpa2.getText().toString().equals("")&&
                        !editTextGpa3.getText().toString().equals("")&&!editTextGpa4.getText().toString().equals("")&&!editTextGpa5.getText().toString().equals("")&&
                        !editTextGpa6.getText().toString().equals("")&&editTextGpa7.getText().toString().equals(""))//null 1
                {
                    try
                    {
                        credit[0] = Double.parseDouble(editTextCre1.getText().toString());
                        credit[1] = Double.parseDouble(editTextCre2.getText().toString());
                        credit[2] = Double.parseDouble(editTextCre3.getText().toString());
                        credit[3] = Double.parseDouble(editTextCre4.getText().toString());
                        credit[4] = Double.parseDouble(editTextCre5.getText().toString());
                        credit[5] = Double.parseDouble(editTextCre6.getText().toString());


                        gpa[0] = Double.parseDouble(editTextGpa1.getText().toString());
                        gpa[1] = Double.parseDouble(editTextGpa2.getText().toString());
                        gpa[2] = Double.parseDouble(editTextGpa3.getText().toString());
                        gpa[3] = Double.parseDouble(editTextGpa4.getText().toString());
                        gpa[4] = Double.parseDouble(editTextGpa5.getText().toString());
                        gpa[5] = Double.parseDouble(editTextGpa6.getText().toString());


                    }catch (Exception ex)
                    {

                    }
                    for (int i = 0; i <=5 ; i++)
                    {
                        ca = credit[i]+ca;
                    }

                    for (int i = 0; i <=5; i++)
                    {
                        gp = (credit[i]*gpa[i])+gp;
                    }
                    ans = gp/ca;

                }else if(!editTextCre1.getText().toString().equals("")&&!editTextCre2.getText().toString().equals("")&&!editTextCre3.getText().toString().equals("")&&
                        !editTextCre4.getText().toString().equals("")&&!editTextCre5.getText().toString().equals("")&&editTextCre6.getText().toString().equals("")&&
                        editTextCre7.getText().toString().equals("")&&!editTextGpa1.getText().toString().equals("")&&!editTextGpa2.getText().toString().equals("")&&
                        !editTextGpa3.getText().toString().equals("")&&!editTextGpa4.getText().toString().equals("")&&!editTextGpa5.getText().toString().equals("")&&
                        editTextGpa6.getText().toString().equals("")&&editTextGpa7.getText().toString().equals(""))//null 2
                {
                    try
                    {
                        credit[0] = Double.parseDouble(editTextCre1.getText().toString());
                        credit[1] = Double.parseDouble(editTextCre2.getText().toString());
                        credit[2] = Double.parseDouble(editTextCre3.getText().toString());
                        credit[3] = Double.parseDouble(editTextCre4.getText().toString());
                        credit[4] = Double.parseDouble(editTextCre5.getText().toString());



                        gpa[0] = Double.parseDouble(editTextGpa1.getText().toString());
                        gpa[1] = Double.parseDouble(editTextGpa2.getText().toString());
                        gpa[2] = Double.parseDouble(editTextGpa3.getText().toString());
                        gpa[3] = Double.parseDouble(editTextGpa4.getText().toString());
                        gpa[4] = Double.parseDouble(editTextGpa5.getText().toString());



                    }catch (Exception ex)
                    {

                    }
                    for (int i = 0; i <=4 ; i++)
                    {
                        ca = credit[i]+ca;
                    }

                    for (int i = 0; i <=4 ; i++)
                    {
                        gp = (credit[i]*gpa[i])+gp;
                    }
                    ans = gp/ca;

                }else if(!editTextCre1.getText().toString().equals("")&&!editTextCre2.getText().toString().equals("")&&!editTextCre3.getText().toString().equals("")&&
                        !editTextCre4.getText().toString().equals("")&&editTextCre5.getText().toString().equals("")&&editTextCre6.getText().toString().equals("")&&
                        editTextCre7.getText().toString().equals("")&&!editTextGpa1.getText().toString().equals("")&&!editTextGpa2.getText().toString().equals("")&&
                        !editTextGpa3.getText().toString().equals("")&&!editTextGpa4.getText().toString().equals("")&&editTextGpa5.getText().toString().equals("")&&
                        editTextGpa6.getText().toString().equals("")&&editTextGpa7.getText().toString().equals(""))//null 3
                {
                    try
                    {
                        credit[0] = Double.parseDouble(editTextCre1.getText().toString());
                        credit[1] = Double.parseDouble(editTextCre2.getText().toString());
                        credit[2] = Double.parseDouble(editTextCre3.getText().toString());
                        credit[3] = Double.parseDouble(editTextCre4.getText().toString());




                        gpa[0] = Double.parseDouble(editTextGpa1.getText().toString());
                        gpa[1] = Double.parseDouble(editTextGpa2.getText().toString());
                        gpa[2] = Double.parseDouble(editTextGpa3.getText().toString());
                        gpa[3] = Double.parseDouble(editTextGpa4.getText().toString());




                    }catch (Exception ex)
                    {

                    }
                    for (int i = 0; i <=3 ; i++)
                    {
                        ca = credit[i]+ca;
                    }

                    for (int i = 0; i <=3 ; i++)
                    {
                        gp = (credit[i]*gpa[i])+gp;
                    }
                    ans = gp/ca;

                }else if(!editTextCre1.getText().toString().equals("")&&!editTextCre2.getText().toString().equals("")&&!editTextCre3.getText().toString().equals("")&&
                        editTextCre4.getText().toString().equals("")&&editTextCre5.getText().toString().equals("")&&editTextCre6.getText().toString().equals("")&&
                        editTextCre7.getText().toString().equals("")&&!editTextGpa1.getText().toString().equals("")&&!editTextGpa2.getText().toString().equals("")&&
                        !editTextGpa3.getText().toString().equals("")&&editTextGpa4.getText().toString().equals("")&&editTextGpa5.getText().toString().equals("")&&
                        editTextGpa6.getText().toString().equals("")&&editTextGpa7.getText().toString().equals(""))//null 4
                {
                    try
                    {
                        credit[0] = Double.parseDouble(editTextCre1.getText().toString());
                        credit[1] = Double.parseDouble(editTextCre2.getText().toString());
                        credit[2] = Double.parseDouble(editTextCre3.getText().toString());





                        gpa[0] = Double.parseDouble(editTextGpa1.getText().toString());
                        gpa[1] = Double.parseDouble(editTextGpa2.getText().toString());
                        gpa[2] = Double.parseDouble(editTextGpa3.getText().toString());





                    }catch (Exception ex)
                    {

                    }
                    for (int i = 0; i <=2; i++)
                    {
                        ca = credit[i]+ca;
                    }

                    for (int i = 0; i <=2; i++)
                    {
                        gp = (credit[i]*gpa[i])+gp;
                    }
                    ans = gp/ca;

                }else if(!editTextCre1.getText().toString().equals("")&&!editTextCre2.getText().toString().equals("")&&editTextCre3.getText().toString().equals("")&&
                        editTextCre4.getText().toString().equals("")&&editTextCre5.getText().toString().equals("")&&editTextCre6.getText().toString().equals("")&&
                        editTextCre7.getText().toString().equals("")&&!editTextGpa1.getText().toString().equals("")&&!editTextGpa2.getText().toString().equals("")&&
                        editTextGpa3.getText().toString().equals("")&&editTextGpa4.getText().toString().equals("")&&editTextGpa5.getText().toString().equals("")&&
                        editTextGpa6.getText().toString().equals("")&&editTextGpa7.getText().toString().equals(""))//null 5
                {
                    try
                    {
                        credit[0] = Double.parseDouble(editTextCre1.getText().toString());
                        credit[1] = Double.parseDouble(editTextCre2.getText().toString());


                        gpa[0] = Double.parseDouble(editTextGpa1.getText().toString());
                        gpa[1] = Double.parseDouble(editTextGpa2.getText().toString());


                    }catch (Exception ex)
                    {

                    }
                    for (int i = 0; i <=1; i++) {
                        ca = credit[i] + ca;
                    }

                    for (int i = 0; i <=1; i++) {
                        gp = (credit[i] * gpa[i]) + gp;
                    }
                    ans = gp / ca;

                }else if(!editTextCre1.getText().toString().equals("")&&editTextCre2.getText().toString().equals("")&&editTextCre3.getText().toString().equals("")&&
                        editTextCre4.getText().toString().equals("")&&editTextCre5.getText().toString().equals("")&&editTextCre6.getText().toString().equals("")&&
                        editTextCre7.getText().toString().equals("")&&!
                        editTextGpa1.getText().toString().equals("")&&editTextGpa2.getText().toString().equals("")&&
                        editTextGpa3.getText().toString().equals("")&&editTextGpa4.getText().toString().equals("")&&editTextGpa5.getText().toString().equals("")&&
                        editTextGpa6.getText().toString().equals("")&&editTextGpa7.getText().toString().equals(""))//null 6
                {
                    try
                    {
                        credit[0] = Double.parseDouble(editTextCre1.getText().toString());


                        gpa[0] = Double.parseDouble(editTextGpa1.getText().toString());


                    }catch (Exception ex)
                    {

                    }

                    ca = credit[0]+ca;
                    gp = (credit[0]*gpa[0])+gp;
                    ans = gp/ca;
                }else if(!editTextCa.getText().toString().trim().equals("")&&!editTextGp.getText().toString().trim().equals(""))
            {
                try
                {
                    gp=Double.parseDouble(editTextGp.getText().toString().trim());
                    ca=Double.parseDouble(editTextCa.getText().toString().trim());
                }
                catch (Exception ex){}
                ans = gp/ca;
            }
                else if(editTextCre1.getText().toString().equals("")&&editTextCre2.getText().toString().equals("")&&editTextCre3.getText().toString().equals("")&&
                        editTextCre4.getText().toString().equals("")&&editTextCre5.getText().toString().equals("")&&editTextCre6.getText().toString().equals("")&&
                        editTextCre7.getText().toString().equals("")&&editTextGp.getText().toString().equals("")&&editTextCa.getText().toString().equals(""))//all null
                {
                    Toast.makeText(getContext(), "please don't blank", Toast.LENGTH_SHORT).show();
                }
                DecimalFormat df = new DecimalFormat("#.##");
                textView.setText(df.format(ans)+"");
            }
        });
    }

}
