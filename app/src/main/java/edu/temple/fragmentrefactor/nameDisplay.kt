package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class nameDisplay : Fragment() {
    // TODO: Rename and change types of parameters
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val displayTextView : TextView? = view.findViewById<TextView>(R.id.fragment_textView)
        val nameEditText : EditText? = view.findViewById<EditText>(R.id.fragement_textInput)
        val changeButton : Button? = view.findViewById<Button>(R.id.fragement_Button)

        changeButton?.setOnClickListener {
            val name = nameEditText?.text

            displayTextView?.text = if (name?.isNotBlank() == true) {
                "Hello, $name!"
            } else {
                "Please enter your name"
            }
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_name_display, container, false)
    }

}