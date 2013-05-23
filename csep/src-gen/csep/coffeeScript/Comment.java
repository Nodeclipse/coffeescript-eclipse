/**
 */
package csep.coffeeScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link csep.coffeeScript.Comment#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see csep.coffeeScript.CoffeeScriptPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends Stmt
{
  /**
   * Returns the value of the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' attribute.
   * @see #setComment(String)
   * @see csep.coffeeScript.CoffeeScriptPackage#getComment_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link csep.coffeeScript.Comment#getComment <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' attribute.
   * @see #getComment()
   * @generated
   */
  void setComment(String value);

} // Comment
