package com.example.gesture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.view.MotionEventCompat as mec1

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    var gDet:GestureDetectorCompat?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.gDet= GestureDetectorCompat(this,this)
        gDet?.setOnDoubleTapListener(this)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        this.gDet?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    override fun onShowPress(e: MotionEvent?) {
        gesture_status.text="On Show Press"
    }

    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        gesture_status.text="On Single Tap up"
        return true
    }

    override fun onDown(e: MotionEvent?): Boolean {
        gesture_status.text="on Down"
        return true
    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent?,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        gesture_status.text="On Fling"
        return true
    }

    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent?,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        gesture_status.text="On Scroll"
        return true
    }


    override fun onLongPress(e: MotionEvent?) {
        gesture_status.text="O Long Press"
    }

    override fun onDoubleTap(e: MotionEvent?): Boolean {
        gesture_status.text="On Double Tap"
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
        gesture_status.text="OnDoubleTap Event"
        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
        gesture_status.text="OnSingleTapConfirmed"
        return true
    }


}
