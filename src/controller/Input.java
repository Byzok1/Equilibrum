package controller;

import javafx.event.EventHandler;
import javafx.geometry.Point3D;
import javafx.scene.Node;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Transform;

public class Input
{
	/* Clavier */
	public enum KEYSTATE
	{
		PRESSED, RELEASED, DOWN, UP
	};

	public Input(Controller control, Node node)
	{
		// Keyboard Pressed
		node.setOnKeyPressed(new EventHandler<KeyEvent>()
		{
			public void handle(KeyEvent ke)
			{
				switch (ke.getCode())
				{
					case F:
					{
						System.out.println("hello");
						control.root.getScene().setCamera(
								control.perCam);
						break;

					}

					case C:
					{

						
//						control.perCam
//						.getTransforms().add(new Scale(0.7, 0.7, 0.7, 968.0, 548.0, 0.0));
//						
//						control.perCam
//						.getTransforms().add(new Rotate(-40.0, 968.0, 548.0, 0.0, new Point3D(1.0, 0.0, 0.0)));
//						control.perCam
//						.getTransforms().add(new Rotate(15.0, 968.0, 548.0, 0.0, new Point3D(0.0, 1.0, 0.0)));
						
						System.out.println(control.perCam
								.getTransforms().toString());
						
						break;
					}
					case Q:
					{
						control.perCam.getTransforms().add(
								new Rotate(5, control.root
										.getScene().getWindow().getWidth() / 2,
										control.root
												.getScene().getWindow()
												.getHeight() / 2));

						break;

					}
					case E:
					{
						control.perCam.getTransforms().add(
								new Rotate(-5, control.root
										.getWidth() / 2, control.root.getHeight() / 2));

						break;

					}
					case W:
					{
						control.perCam
								.setTranslateY(control.perCam
										.getTranslateY() - 20);
						System.out.println("Translate Y :"
								+ control.perCam
										.getTranslateY());

						break;

					}
					case A:
					{
						control.perCam
								.setTranslateX(control.perCam
										.getTranslateX() - 20);
						System.out.println("Translate X :"
								+ control.perCam
										.getTranslateY());
						break;

					}
					case S:
					{
						control.perCam
								.setTranslateY(control.perCam
										.getTranslateY() + 20);
						System.out.println("Translate Y :"
								+ control.perCam
										.getTranslateY());
						break;

					}
					case D:
					{
						control.perCam
								.setTranslateX(control.perCam
										.getTranslateX() + 20);
						System.out.println("Translate X :"
								+ control.perCam
										.getTranslateX());
						break;

					}
					case T:
					{
						control.perCam
								.setTranslateZ(control.perCam
										.getTranslateZ() + 20);
						System.out.println("Translate Z :"
								+ control.perCam
										.getTranslateZ());
						break;

					}
					case G:
					{
						control.perCam
								.setTranslateZ(control.perCam
										.getTranslateZ() - 20);
						System.out.println("Translate Z :"
								+ control.perCam
										.getTranslateZ());
						break;

					}
					case Z:
					{
						control.perCam
								.setFieldOfView(control.perCam
										.getFieldOfView() - 5);
						System.out.println(control.perCam
								.getFieldOfView());
						break;

					}
					case X:
					{
						control.perCam
								.setFieldOfView(control.perCam
										.getFieldOfView() + 5);
						System.out.println(control.perCam
								.getFieldOfView());
						break;
					}
					case NUMPAD6:
					{
						control.perCam.getTransforms().add(
								new Rotate(5, control.root
										.getScene().getWindow().getWidth() / 2,
										control.root
												.getScene().getWindow()
												.getHeight() / 2, control.perCam
												.getTranslateZ(), new Point3D(
												0, 1, 0)));

						// (5, control.root
						// .getWidth() / 2, Controller
						// .getController().root.getHeight() / 2));
						break;
					}

					case NUMPAD4:
					{
						control.perCam.getTransforms().add(
								new Rotate(-5, control.root
										.getScene().getWindow().getWidth() / 2,
										control.root
												.getScene().getWindow()
												.getHeight() / 2, control.perCam
												.getTranslateZ(), new Point3D(
												0, 1, 0)));
						break;
					}
					case NUMPAD8:
					{
						control.perCam.getTransforms().add(
								new Rotate(-5, control.root
										.getScene().getWindow().getWidth() / 2,
										control.root
												.getScene().getWindow()
												.getHeight() / 2, control.perCam
												.getTranslateZ(), new Point3D(
												1, 0, 0)));
						break;
					}
					case NUMPAD5:
					{
						control.perCam.getTransforms().add(
								new Rotate(5, control.root
										.getScene().getWindow().getWidth() / 2,
										control.root
												.getScene().getWindow()
												.getHeight() / 2, control.perCam
												.getTranslateZ(), new Point3D(
												1, 0, 0)));
						break;
					}
					case NUMPAD9:
					{
						control.perCam.getTransforms().add(
								new Scale(0.9, 0.9, 0.9, control.root.getScene()
										.getWindow().getWidth() / 2, control.root.getScene()
										.getWindow().getHeight() / 2, 0));

						break;
					}
					case NUMPAD3:
					{
						control.perCam.getTransforms().add(
								new Scale(1.1, 1.1, 1.1, control.root.getScene()
										.getWindow().getWidth() / 2, control.root.getScene()
										.getWindow().getHeight() / 2, 0));
						break;
					}
					case R:
					{
						control.perCam.getTransforms()
								.clear();
						control.perCam
								.setRotationAxis(Rotate.Z_AXIS);
						control.perCam.setRotate(0);
						control.perCam.setFieldOfView(360);
						control.perCam.setTranslateX(0);
						control.perCam.setTranslateY(0);
						control.perCam.setTranslateZ(0);
						control.perCam.setScaleX(1);
						control.perCam.setScaleY(1);
						control.perCam.setScaleZ(1);
						System.out.println("reset");
						break;
					}
					default:
					{
						System.out.println("something");
						break;
					}

				}
			}
		});

		node.setOnMouseClicked(new EventHandler<MouseEvent>()
		{

			@Override
			public void handle(MouseEvent me)
			{
				System.out.println("hi" + me.getSceneX());

			}

		});
	}
}
