package com.example.circlemenu

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.menu.view.*

class Menu @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : MotionLayout(context, attrs, defStyle) {

    var onItemClickListener: OnItemClickListener? = null

    init {
        LayoutInflater.from(context).inflate(R.layout.menu, this, true)

        fabMain.setOnClickListener {
            if (motionLayout.currentState == motionLayout.startState) {
                motionLayout.transitionToEnd()
            } else {
                motionLayout.transitionToStart()
            }
        }

        fab1.setOnClickListener {
            onItemClickListener?.onItemClick(1)
        }

        fab2.setOnClickListener {
            onItemClickListener?.onItemClick(2)
        }

        fab3.setOnClickListener {
            onItemClickListener?.onItemClick(3)
        }

        fab4.setOnClickListener {
            onItemClickListener?.onItemClick(4)
        }

        fab5.setOnClickListener {
            onItemClickListener?.onItemClick(5)
        }
    }
}

interface OnItemClickListener {

    fun onItemClick(item: Int)
}