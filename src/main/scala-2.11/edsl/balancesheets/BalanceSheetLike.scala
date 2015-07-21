/*
Copyright 2015 David R. Pugh, Dan F. Tang, J. Doyne Farmer

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License
is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
or implied. See the License for the specific language governing permissions and limitations under
the License.
*/
package edsl.balancesheets

import akka.actor.ActorRef
import edsl.CounterpartyActor

import scala.collection.mutable


/** Base trait for a [[CounterpartyActor `CounterpartyActor`]] actor's `BalanceSheet`. */
trait BalanceSheetLike {

  /** Collection of [[CounterpartyActor `CounterpartyActor`]] actors that represent assets. */
  def assets: mutable.Set[ActorRef]

  /** Collection of [[CounterpartyActor `CounterpartyActor`]] actors that represent liabilities. */
  def liabilities: mutable.Set[ActorRef]

}