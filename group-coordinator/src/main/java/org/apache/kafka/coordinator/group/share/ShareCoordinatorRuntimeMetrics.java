/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.kafka.coordinator.group.share;

import org.apache.kafka.common.metrics.Metrics;
import org.apache.kafka.coordinator.group.metrics.GroupCoordinatorRuntimeMetrics;

public class ShareCoordinatorRuntimeMetrics extends GroupCoordinatorRuntimeMetrics {

  public static final String METRICS_GROUP = "share-coordinator-metrics";

  public ShareCoordinatorRuntimeMetrics(Metrics metrics, String metricsGroup) {
    //partition-load-time (partition-load-time-avg and partition-load-time-max) Meter share-coordinator-metrics The time taken in milliseconds to load the share-group state from the share-group state partitions.
    //thread-idle-ratio (thread-idle-ratio-min and thread-idle-ratio-avg) Meter share-coordinator-metrics The fraction of time the share coordinator thread is idle.
    //num-partitions Gauge share-coordinator-metrics The number of partitions in the share-state topic.
    super(metrics, METRICS_GROUP);
  }
}