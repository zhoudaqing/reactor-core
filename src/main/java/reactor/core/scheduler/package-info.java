/*
 * Copyright (c) 2011-2016 Pivotal Software Inc, All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * {@link reactor.core.scheduler.Scheduler} and  {@link reactor.core.scheduler.TimedScheduler} contract and static
 * factory methods in {@link reactor.core.scheduler.Timer}. Used for
 * scheduling {@link reactor.core.publisher.Mono#delay},
 * {@link reactor.core.publisher.Flux#interval}, timeout handling or polling tasks.
 *
 * @author Stephane Maldini
 */
package reactor.core.scheduler;