package various

import io.estatico.newtype.macros._
import various.newts._
import cats.effect._

import eu.timepit.refined.api.Refined
import eu.timepit.refined.types.string.NonEmptyString
import eu.timepit.refined.collection.Contains
import eu.timepit.refined.auto._

object Stuff {
  def lookup(username: Username, email: Email):IO[Option[User]] = IO.pure(Some(User(username, email)))
  def lookup(username: NonEmptyString): IO[Option[User]] = ???


}

object refinement {
  type Username = String Refined Contains['g']

  def foo(username: Username): String =
    username.value

  foo("gvolpe")
}

object newts {
  type EmailType = String Refined Contains['@']
  @newtype case class Username(value: String)

  @newtype case class   Email(value: EmailType)
}


case class User(username: Username, email: Email)

