package es.escuelait.mastermind.models;

public class Session {

  private Game game;
  private GameRegistry registry;
  private State state;

  public Session() {
    this.state = new State();
    this.game = new Game();
  }

  public StateValue getValueState() {
    return this.state.getValueState();
  }

  public void next() {
    this.state.next();
  }

  public void reset() {
    this.game.reset();
    this.state.reset();
  }

  public void undo() {
    this.registry.undo();
  }

  public boolean undoable() {
    return this.registry.isUndoable();
  }

  public void redo() {
    this.registry.redo();
  }

  public boolean redoable() {
    return this.registry.isRedoable();
  }

}
