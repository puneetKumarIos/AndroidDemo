package com.example.constraintslayout.ui.homeActivity


import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.constraintslayout.R
import kotlinx.android.synthetic.main.fragment_home_screen.*

class HomeScreenFrg : Fragment()
{

    // ==================================================================================//
    // MARK: ********************* Variable *********************
    // ==================================================================================//


    // ==================================================================================//
    // MARK: ********************* Default  Fragment Method *********************
    // ==================================================================================//

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        return inflater.inflate(R.layout.fragment_home_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setValue()


    }


    // ==================================================================================//
    // MARK: ********************* Private Method *********************
    // ==================================================================================//

    fun setValue()
    {
        name_textView.text = setBoldSpannable("Welcome Piyush Shandilya","Piyush Shandilya")
        last_sync_textView.text = setBoldOnKeywords("Last synced on 14 Aug 2019 at 6:10 PM",arrayOf<String>("14 Aug 2019","6:10 PM"),arrayOf<Int>(resources.getColor(R.color.darkGrey),resources.getColor(R.color.darkGrey)))
    }


    private fun setBoldSpannable(mainText: String,subString:String): SpannableString
    {

        val startIndex = mainText.indexOf(subString)
        val endIndex   = startIndex + subString.length

        val spannableContent = SpannableString(mainText)
        spannableContent.setSpan(StyleSpan(Typeface.BOLD), startIndex,  endIndex, Spannable.SPAN_INCLUSIVE_INCLUSIVE)


        val colorId = resources.getColor(R.color.white)
        spannableContent.setSpan(ForegroundColorSpan(colorId), startIndex,  endIndex, Spannable.SPAN_INCLUSIVE_INCLUSIVE)
        return spannableContent
    }

    private fun setBoldOnKeywords(text: String, searchKeywords: Array<String>,colors:Array<Int>): SpannableStringBuilder
    {
        val span = SpannableStringBuilder(text)

        var i = 0
        for (keyword in searchKeywords)
        {

            var offset = 0
            var start: Int

            val len = keyword.length

            start = text.indexOf(keyword, offset, true)

            while (start >= 0)
            {
                val spanStyle = StyleSpan(Typeface.BOLD)
                span.setSpan(spanStyle, start, start + len, Spanned.SPAN_INCLUSIVE_INCLUSIVE)

                val colorId = colors[i]
                span.setSpan(ForegroundColorSpan(colorId), start,  start + len, Spannable.SPAN_INCLUSIVE_INCLUSIVE)

                offset = start + len
                start = text.indexOf(keyword, offset, true)
                i++
            }
        }
        return span
    }



}
