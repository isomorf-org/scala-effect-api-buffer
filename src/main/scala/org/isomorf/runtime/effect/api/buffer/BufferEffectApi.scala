package org.isomorf.runtime.effect.api.buffer

import org.isomorf.foundation.runtime.effects.EffectReference1
import org.isomorf.foundation.runtime.effects.plugins.EffectProvider
import org.isomorf.runtime.effect.api.buffer.BufferEffectApi.BufferHandle
import org.isomorf.runtime.effect.api.buffer.BufferEffectApi.Natural

object BufferEffectApi {

  type Natural = scala.BigInt

  type BufferHandle[A] = EffectReference1[Array[A]]
}

trait BufferEffectApi extends EffectProvider {

  def allocate[A](size: Natural): BufferHandle[A]

  def copy[A](srcHandle: BufferHandle[A], destHandle: BufferHandle[A], length: Natural, srcIndex: Natural, destIndex: Natural): Unit

  def initialize[A](source: scala.List[A]): BufferHandle[A]

  def get[A](handle: BufferHandle[A], index: Natural): scala.Option[A]

  def length[A](handle: BufferHandle[A]): Natural

  def set[A](handle: BufferHandle[A], index: Natural, value: A): Unit

  def toList[A](handle: BufferHandle[A]): scala.List[A]

  def unset[A](handle: BufferHandle[A], index: Natural): scala.Option[A]
}
