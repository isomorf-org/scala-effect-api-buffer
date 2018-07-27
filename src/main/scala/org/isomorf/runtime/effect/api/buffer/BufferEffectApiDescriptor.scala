package org.isomorf.runtime.effect.api.buffer

import org.isomorf.foundation.runtime.effects.plugins.EffectApiDescriptor

class BufferEffectApiDescriptor extends EffectApiDescriptor[BufferEffectApi] {

  override final val getHandle = "buffer"

  override final val getType = classOf[BufferEffectApi]
}
