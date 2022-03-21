package edu.wk4final.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {

    var field_a : MutableLiveData<String> = MutableLiveData()
    var field_b : MutableLiveData<String> = MutableLiveData()

    var result : MutableLiveData<Double> = MutableLiveData()

    fun doMath()  {
        var a = 0.0
        var b = 0.0
        try {
            field_a.let {
                if (!it.value.equals("") && it.value != null) {
                    a = it.value!!.toDouble()
                }
            }

            field_b.let {
                if (!it.value.equals("") && it.value != null) {
                    b = it.value!!.toDouble()
                }
            }

            result.let {
                result.value = a * b
            }

        } catch (e: Exception) {
            e.printStackTrace()
            Log.e("MATH OPERATION","${e.message} ${e.cause} ${e.suppressed} a: ${a} a_field: ${field_a} b_field: ${field_b}" )
        }

    }

}