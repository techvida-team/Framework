package team.techvida.uppercasetexview

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp


@Composable
fun UppercaseText(
    text: String,
    color: Color = Color.Black,
    fontSize: TextUnit = 14.sp
) {

    Text(
        text = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = color,
                    fontSize = (fontSize.value + 4f).sp,
                    fontWeight = FontWeight.Bold
                )
            ) {
                if (text.isNotEmpty())
                    append(text[0])
            }

            if (text.length > 1)
                append(text.substring(1))
        },
        color = color,
        fontSize = fontSize

    )


}
