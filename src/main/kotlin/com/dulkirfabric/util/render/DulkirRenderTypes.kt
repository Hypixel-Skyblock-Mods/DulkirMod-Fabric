package com.dulkirfabric.util.render

import net.minecraft.client.renderer.rendertype.LayeringTransform
import net.minecraft.client.renderer.rendertype.RenderSetup
import net.minecraft.client.renderer.rendertype.RenderType

object DulkirRenderTypes {

    val DULKIR_LINES: RenderType = RenderType.create(
        "dulkir_lines",
        RenderSetup.builder(DulkirRenderPipelines.DULKIR_LINES)
            .setLayeringTransform(LayeringTransform.VIEW_OFFSET_Z_LAYERING)
            .createRenderSetup()
    )

    val DULKIR_LINES_ESP: RenderType  = RenderType.create(
        "dulkir_lines_esp",
        RenderSetup.builder(DulkirRenderPipelines.DULKIR_LINES_ESP)
            .createRenderSetup()
    )

    val DULKIR_TRIANGLE_STRIP: RenderType  = RenderType.create(
        "dulkir_triangle_strip",
        RenderSetup.builder(DulkirRenderPipelines.DULKIR_TRIANGLE_STRIP)
            .setLayeringTransform(LayeringTransform.VIEW_OFFSET_Z_LAYERING)
            .sortOnUpload()
            .createRenderSetup()
    )

    val DULKIR_TRIANGLE_STRIP_ESP: RenderType = RenderType.create(
        "dulkir_triangle_strip_esp",
        RenderSetup.builder(DulkirRenderPipelines.DULKIR_TRIANGLE_STRIP_ESP)
            .sortOnUpload()
            .createRenderSetup()
    )

    val DULKIR_QUADS: RenderType = RenderType.create(
        "dulkir_quads",
        RenderSetup.builder(DulkirRenderPipelines.DULKIR_QUADS)
            .setLayeringTransform(LayeringTransform.VIEW_OFFSET_Z_LAYERING)
            .sortOnUpload()
            .createRenderSetup()
    )

    val DULKIR_QUADS_ESP: RenderType = RenderType.create(
        "dulkir_quads_esp",
        RenderSetup.builder(DulkirRenderPipelines.DULKIR_QUADS_ESP)
            .sortOnUpload()
            .createRenderSetup()
    )

}
