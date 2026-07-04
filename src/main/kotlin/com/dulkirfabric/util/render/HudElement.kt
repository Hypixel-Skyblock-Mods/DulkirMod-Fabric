package com.dulkirfabric.util.render

import kotlinx.serialization.Serializable
import net.minecraft.network.chat.Component
import net.minecraft.resources.Identifier
import org.joml.Matrix3x2f
import org.joml.Vector2i
import org.joml.Vector2ic

class HudElement (var meta: HudMeta,
                  val identifier: Identifier,
                  private val label: Component,
                  private val width: Int,
                  private val height: Int
    ) {

    fun getHudId(): Identifier {
        return this.identifier;
    }

    fun getPosition(): Vector2ic {
        return Vector2i(this.meta.xPos, this.meta.yPos)
    }

    fun setPosition(position: Vector2ic) {
        this.meta.xPos = position.x()
        this.meta.yPos = position.y()
    }

    fun isEnabled(): Boolean {
        return true
    }

    fun isVisible(): Boolean {
        return true
    }

    fun getUnscaledWidth(): Int {
        return this.width
    }

    fun getUnscaledHeight(): Int {
        return this.height
    }

    fun getLabel(): Component {
        return this.label
    }

    fun getScale(): Float {
        return this.meta.scale
    }

    fun setScale(scale: Float) {
        this.meta.scale = scale
    }

    @Serializable
    data class HudMeta(
        var xPos: Int = 1,
        var yPos: Int = 1,
        var scale: Float = 1f
    )

    fun applyTransformations(matrices: Matrix3x2f?) {
        matrices?.translate(meta.xPos.toFloat(), meta.yPos.toFloat())
        matrices?.scale(meta.scale, meta.scale)
    }

}
