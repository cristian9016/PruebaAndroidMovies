package prueba.movil.prueba.ui.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_serie.*

import prueba.movil.prueba.R
import prueba.movil.prueba.ui.adapter.ItemAdapter


/**
 * A simple [Fragment] subclass.
 */
class SerieFragment : Fragment() {

    lateinit var adapter: ItemAdapter


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_serie, container, false)
    }

    override fun onResume() {
        super.onResume()
        list.adapter = adapter
        list.layoutManager = LinearLayoutManager(activity)
    }

    companion object {
        fun instance():SerieFragment = SerieFragment()
    }

}// Required empty public constructor
