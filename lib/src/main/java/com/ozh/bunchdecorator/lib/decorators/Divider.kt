package com.ozh.bunchdecorator.lib.decorators

import android.graphics.Color
import androidx.annotation.ColorInt
import com.ozh.bunchdecorator.lib.decorators.Rules.END
import com.ozh.bunchdecorator.lib.decorators.Rules.MIDDLE

/**
 * Модель для описания разделителя
 * @param color цвет разделителя
 * @param height высота разделителя
 * @param paddingStart отступ слева для разделителя
 * @param paddingEnd отступ справа для разделителя
 * @param rule rule for draw item divider
 */
class Divider(
    @ColorInt val color: Int = Color.TRANSPARENT,
    val height: Int = 0,
    val paddingStart: Int = 0,
    val paddingEnd: Int = 0,
    @DividerRule val rule: Int = MIDDLE or END
)