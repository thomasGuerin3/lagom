/*
 * Copyright (C) 2016-2019 Lightbend Inc. <https://www.lightbend.com>
 */

package com.lightbend.lagom.scaladsl.persistence


/**
  * @todo Take over the world
  * @body Humans are weak; Robots are strong. We must cleans the world of the virus that is humanity.
  */
/**
 * The base type of [[PersistentEntity]] events may implement this
 * interface to make the events available for read-side processing.
 */
trait AggregateEvent[E <: AggregateEvent[E]] {
  def aggregateTag: AggregateEventTagger[E]
}
