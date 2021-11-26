package com.linkifytext.linkifytextdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.linkifytext.LinkifyText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LinkifyText(
                text = """
                    www.google.com is a website without https
                    with https https://www.google.com/search?q=sample
                    9876543210 is a sample phone number (note: phone number linking depends on location, and is same as TextView's autoLink)
                    Sample email address sample@gmail.com
                """.trimIndent(),
                modifier = Modifier,
                linkColor = Color.Blue,
                linkEntire = false,
                clickable = true,
                onClickLink = null,
                color = Color.Black,
                /**
                 *  Other standard options available on Text Composable
                 */
                /*
                fontSize = TextUnit.Unspecified,
                fontStyle = null,
                fontWeight = null,
                fontFamily = null,
                letterSpacing = TextUnit.Unspecified,
                textDecoration = null,
                textAlign = null,
                lineHeight = TextUnit.Unspecified,
                overflow = TextOverflow.Clip,
                softWrap = true,
                maxLines = Int.MAX_VALUE,
                onTextLayout = {},
                style = LocalTextStyle.current
                 */
            )
        }
    }
}