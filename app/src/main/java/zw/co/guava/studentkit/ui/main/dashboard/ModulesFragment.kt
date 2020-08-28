package zw.co.guava.studentkit.ui.main.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import zw.co.guava.studentkit.R

class ModulesFragment : Fragment() {


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_modules, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)


        return root
    }
}